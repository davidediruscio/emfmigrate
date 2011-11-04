SYNTAXDEF EmigOcl
FOR <http://www.univaq.it/coevolution/emfmigrate/EmigOcl>
START Module

OPTIONS {
	usePredefinedTokens = "false";
	disableTokenSorting = "true";
	overrideResourceFactory = "false";
}

TOKENS {
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT CHAR $('A'..'Z'|'a'..'z')$;
	DEFINE TXTOP $('not'|'and'|'or'|'xor'|'implies'|'div'|'mod')$;
	DEFINE SYMOP $('-'|'+'|'*'|'/'|'='|'>'|'<'|'>='|'<=')$;
	DEFINE COMMENT $'--'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE FLOAT INTEGER + $'.'($ + DIGIT + $)+$;
	DEFINE INTEGER $'-'?($ + DIGIT + $)+$;
	DEFINE STRINGTYPE $'String'$;
	DEFINE BOOLEANTYPE $'Boolean'$;
	DEFINE INTEGERTYPE $'Integer'$;
	DEFINE REALTYPE $'Real'$;
	DEFINE BAGTYPE $'Bag'$;
	DEFINE ORDEREDSETTYPE $'OrderedSet'$;
	DEFINE SEQUENCETYPE $'Sequence'$;
	DEFINE SETTYPE $'Set'$;
	DEFINE OCLANYTYPE $'OclAny'$;
	DEFINE TUPLETYPE $'Tuple'$;
	DEFINE MAPTYPE $'Map'$;
	DEFINE STRING $'"'.*'"'$;
	DEFINE TEXT CHAR + $($ + CHAR + $|$ + DIGIT + $|'-'|'_')*$;
	DEFINE LINEBREAK $('\r\n'|'\'r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

TOKENSTYLES {
	"TXTOP" COLOR #800040, BOLD;
	"COMMENT" COLOR #53876D;
	"FLOAT" COLOR #2A00FF;
	"INTEGER" COLOR #2A00FF;
	"STRING" COLOR #2A00FF;
	"STRINGTYPE" COLOR #00C000;
	"BOOLEANTYPE" COLOR #00C000;
	"INTEGERTYPE" COLOR #00C000;
	"REALTYPE" COLOR #00C000;
	"BAGTYPE" COLOR #00C000;
	"ORDEREDSETTYPE" COLOR #00C000;
	"SEQUENCETYPE" COLOR #00C000;
	"SETTYPE" COLOR #00C000;
	"OCLANYTYPE" COLOR #00C000;
	"TUPLETYPE" COLOR #00C000;
	"MAPTYPE" COLOR #00C000;
	"true" COLOR #00D0FF;
	"false" COLOR #00D0FF;
}

RULES {
	Module ::= "module" name[] ";" (!0 models ("," models)* ";")? (!0 features ("," features)*)?;
	OclFeatureDefinition ::= context_? "def" ":" feature;
	OclContextDefinition ::= "context" context_;
	OclType ::= name[];
	OclModel ::= name[] ":" metamodel[];
	Attribute ::= name[] ":" type "=" !1 initExpression ";";
	Operation ::= name[] "(" (parameters ("," parameters)*)? ")" ":" returnType "=" !1 body ";";
	Parameter ::= varName[] (":" type)?;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	VariableExp ::= referredVariable[];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	SuperExp ::= "super";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	StringExp ::= stringSymbol[STRING];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	BooleanExp ::= booleanSymbol["true" : "false"];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	RealExp ::= realSymbol[FLOAT];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	IntegerExp ::= integerSymbol[INTEGER];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	BagExp ::= "Bag" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	OrderedSetExp ::= "OrderedSet" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	SequenceExp ::= "Sequence" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	SetExp ::= "Set" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	TupleExp ::= "Tuple" "{" (tuplePart ("," tuplePart)*)? "}";

	TuplePart ::= varName[] (":" type)? ("=" initExpression)?;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	MapExp ::= "Map" "{" (elements ("," elements)*)? "}";

	MapElement ::= "(" key "," value ")";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	EnumLiteralExp ::= "#" name[];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	OclUndefinedExp ::= "OclUndefined";

	@Operator(type="unary_postfix", weight="1", superclass="OclExpression")
	NavigationOrAttributeCallExp ::= source "." name[];

	@Operator(type="unary_postfix", weight="2", superclass="OclExpression")
	OperationCallExp ::= source "." operationName[] "(" (arguments ("," arguments)*)? ")";

	@Operator(type="unary_postfix", weight="6", superclass="OclExpression")
	OperatorCallExp ::= source (operationName[TXTOP]|operationName[SYMOP]) arguments;

	@Operator(type="unary_postfix", weight="3", superclass="OclExpression")
	CollectionOperationCallExp ::= source "->" operationName[] "(" (arguments ("," arguments)*)? ")";

	@Operator(type="unary_postfix", weight="5", superclass="OclExpression")
	IterateExp ::= source "->" "iterate" "(" iterators ("," iterators)* ";" result "|" body ")";

	@Operator(type="unary_postfix", weight="4", superclass="OclExpression")
	IteratorExp ::= source "->" name[] "(" iterators ("," iterators)* "|" body ")";

	Iterator ::= varName[] (":" type)?;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	LetExp ::= "let" variable "in" in_;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	IfExp ::= "if" condition "then" thenExpression "else" elseExpression "endif";

	VariableDeclaration ::= varName[] (":" type)? ("=" initExpression)?;
	CollectionType ::= name[] "(" elementType ")";
	StringType ::= name[STRINGTYPE];
	BooleanType ::= name[BOOLEANTYPE];
	IntegerType ::= name[INTEGERTYPE];
	RealType ::= name[REALTYPE];
	BagType ::= name[BAGTYPE] "(" elementType ")";
	OrderedSetType ::= name[ORDEREDSETTYPE] "(" elementType ")";
	SequenceType ::= name[SEQUENCETYPE] "(" elementType ")";
	SetType ::= name[SETTYPE] "(" elementType ")";
	OclAnyType ::= name[OCLANYTYPE];
	TupleType ::= name[TUPLETYPE] "(" (attributes ("," attributes)*)? ")";
	TupleTypeAttribute ::= name[] ":" type;
	OclModelElement ::= model[] "!" name[];
	MapType ::= name[MAPTYPE] "(" keyType "," valueType ")";
}
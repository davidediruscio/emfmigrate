SYNTAXDEF emig
FOR <http://www.emftext.org/language/emig>
START MigrationLibrary

IMPORTS { 
	simpleocl : <http://soft.vub.ac.be/simpleocl/2011/SimpleOCL>
		WITH SYNTAX simpleocl <platform:/plugin/be.ac.vub.simpleocl/metamodel/simpleocl.cs>
}

OPTIONS {
    reloadGeneratorModel = "true";
	usePredefinedTokens = "false";
	overrideResourceFactory = "false";
	overrideBuilder = "false";
	overrideBuilderAdapter = "false";
	disableLaunchSupport = "true";
	overrideLineBreakpoint = "false";
	overrideLineBreakpointAdapter = "false";
}

TOKENS {
	DEFINE PACKAGEOP $'addPackage'|'changePackage'|'deletePackage'$;
	DEFINE CLASSOP $'addClass'|'changeClass'|'deleteClass'$;
	DEFINE ATTOP $'addAttribute'|'changeAttribute'|'deleteAttribute'$;
	DEFINE REFOP $'addReference'|'changeReference'|'deleteReference'$;
}

TOKENSTYLES {
	"PACKAGEOP" COLOR #800040, BOLD;
	"CLASSOP" COLOR #800040, BOLD;
	"ATTOP" COLOR #800040, BOLD;
	"REFOP" COLOR #800040, BOLD;
}

RULES {
	MigrationProgram ::= 
		"migration" name[] ";"
		(!0 imports*)?
		(!0 metamodels*)?
		!0 "migrate" model "with" delta[] ";"
		!0 (elements)*
	;

	MigrationLibrary ::= "library" name[] ";"
		(!0 imports*)?
		(!0 metamodels*)?
		!0 (elements)*
	;

	@Foldable
	Rule ::= "rule" name[] 
		!0 "[" !1 filter !0 "]"
		!0 "{" (!1 rewritingRules)* !0 "}"
		(!0 "where" "[" where "]")?
	;

	PackageOpDef ::= 
		packagePar "=" op[PACKAGEOP]
		"{"	(setters|classesOp)* "}"
	;

	Package ::= 
		"package" varName[]
	;
	
	ClassOpDef ::= 
		classPar "=" op[CLASSOP]
		"{" (setters|featureOp)* "}"
	;

	Class ::= 
		"class" varName[]
	;
	
	AttributeOpDef ::= 
		attributePar "=" op[ATTOP] 
		"{" setters* "}"
	;

	Attribute  ::= 
		"attribute" varName[]
	;
	
	ReferenceOpDef ::= 
		referencePar "=" op[REFOP]
		"{" setters* "}"
	;

	Reference ::= 
		"reference" varName[] 
	;
	
	SetterDef ::= 
		"set" metafeature[] ("<-" (parametersDef)) ";"
	;
	
 	MParameter ::= 
 		"var" varName[]
 	;

	RewritingRule ::= 
		(left) (","left)* "->" ((right)?(","right)*|"drop") ";"
	;	

	LeftRuleElement ::=
		varName[] ":" type
	;

	RightRuleElement ::=
		varName[] ":" type
		"[" binding? (","binding)* "]"
	;

	Binding ::=
		property[] "<-" expr
	;

}
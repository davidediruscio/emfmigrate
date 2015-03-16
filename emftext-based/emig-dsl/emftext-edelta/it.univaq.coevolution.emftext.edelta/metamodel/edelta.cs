SYNTAXDEF edelta
FOR <http://www.emfmigrate.org/edelta>
START Model

OPTIONS {
    reloadGeneratorModel = "true";
}

RULES { 
Model::= module !0
"datatypes"#0"{"#2(datatypes)*"}"
( packageoperations)*

;

DataType ::=   "datatype" #1 name[] ;

Module::="module" name[] ";";

addPackage  ::=  "addPackage"#0"("( name['"','"'] )")" "{"

( !2setter|!2classesoperations)*

"}";
changePackage  ::=  "changePackage"#0"("( ext['"','"']|ref[] )")" "{"
( !2setter|!2classesoperations)*

"}";
deletePackage  ::=  "deletePackage"#0"("( ext['"','"']|ref[] )")" "{"
( !2setter|!2classesoperations)*

"}";

Package::="package"#1name[] ("=" (packageOp) )?;
Class ::= "class"#1name[] ("=" (classOp))? ;

addClass::=  "addClass"#0"("( name['"','"'] )")" "{"
( !2setter|!2featuresoperations)*
"}";
changeClass::=  "changeClass"#0"("( ext[]|ref['"','"'] )")" "{"
( !2setter|!2featuresoperations)*
"}";
deleteClass::=  "deleteClass"#0"("( ext[]|ref['"','"'] )")" "{"
( !2setter|!2featuresoperations)*
"}";

addAttribute ::= "addAttribute"#0"(" (name['"','"']) ")" "{" (!2setter)*"}";
deleteAttribute::= "deleteAttribute"#0"("( ext['"','"']|ref[])")" "{"(!2setter)* "}";
changeAttribute::=  "changeAttribute"#0"("(ext['"','"']|ref[])")" "{" (!2setter)*"}";
addReference::=  "addReference"#0"("(name['"','"'])")" "{" (!2setter)*"}";
deleteReference::=  "deleteReference"#0"("(ext['"','"']|ref[])")" "{"(!2setter)* "}";
changeReference::=  "changeReference"#0"("(ext['"','"']|ref[])")" "{" (!2setter)*"}";

Attribute ::=  "attribute"#1name[] ("=" (featuresOp))?;
Reference ::= "reference"#1name[] ("=" (featuresOp))?;

Setter ::= "set" metafeature[] "<-" (value) ";";

SetterValue ::= (name[]|name['"','"'])("."feature[])?;




Parameter ::= (type[]#1name[])|(refType)  ;


}
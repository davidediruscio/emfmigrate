# EMFMigrate

EMFMigrate is an approach supporting the coupled evolution in a uniform and comprehensive way, in the sense that it is not restricted to specific kinds of
artifacts. The approach consists of a DSL (emig) which provides modelers with dedicated constructs for 

<ul>
<li>i) specifying migration libraries, which aim to embody and enable the reuse of recurrent artifact adaptations; 
<li>ii) customizing migrations already available in libraries; and 
<li>iii) managing those migrations which are not fully automated and that require user intervention. 
</ul>
In other words, metamodel refactorings originate different adaptations depending on the kind of artifact to be kept consistent, with each adaptation formalized in a library. Recurrent adaptations are specified in default libraries which can be in turn customized in order to address ad-hoc needs.

A first implementation of the approach was based on EMFTVM and XText (see the folder <code>xtext-based</code>). The new implementation of EMFMigrate (see the folder <code>emftext-based</code>) is based on EMFText and on the ETL and EPL Epsilon languages.

For an introduction to the coupled evolution problem and for some applications of EMFMigrate please refer to the following publications:

<ul>
<li>Davide Di Ruscio, Juergen Etzlstorfer, Ludovico Iovino, Alfonso Pierantonio and Wieland Schwinger, <b>Supporting variability exploration and resolution during model migration</b>, in: 12th European Conference on Modelling Foundations and Applications (ECMFA), Vienna, Austria, 2016
<li>Juri Di Rocco, Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>Dealing with the coupled evolution of metamodels and model-to-text transformations</b>, in: Models and Evolution (ME2014) workshop @MoDELS 2014, Valencia, Spain, 2014
<li>Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>A methodological approach for the coupled evolution of metamodels and ATL transformations</b>, in: 6th International Conference on Model Transformation (ICMT2013), Budapest, Hungary, pages 60-75, Springer, 2013
<li>Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>Managing the Coupled Evolution of Metamodels and Textual Concrete Syntax Specifications</b>, in: 39th Euromicro Conference on Software Engineering and Advanced Applications (SEAA 2013), Santander, Spain, 2013
<li>Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>Evolutionary togetherness: how to manage coupled evolution in metamodeling ecosystems</b>, in: Intl. Conf. on Graph Transformations (ICGT 2012), Springer, 2012
<li>Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>Coupled Evolution in Model-Driven Engineering</b> (2012), in: IEEE Software, 29:6(78-84)
<li>Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>What is needed for managing co-evolution in MDE?</b>, in: Proceedings of the 2nd International Workshop on Model Comparison in Practice, pages 30-38, ACM, 2011
<li>Davide Di Ruscio, Ralf Laemmel and Alfonso Pierantonio, <b>Automated co-evolution of GMF editor models</b>, in: 3rd International Conference on Software Language Engineering (SLE 2010), Eindhoven, The Netherlands, pages 143--162, Springer, Heidelberg, 2010
<li>Antonio Cicchetti, Davide Di Ruscio and Alfonso Pierantonio, <b>Managing dependent changes in coupled evolution</b>, in: Proc. 2nd International Conference on Model Transformation (ICMT'09), pages 35-51, Springer, 2009
<li>Antonio Cicchetti, Davide Di Ruscio, Romina Eramo and Alfonso Pierantonio, <b>Automating Co-evolution in Model-Driven Engineering</b>, in: 12th International IEEE Enterprise Distributed Object Computing Conference (EDOC 2008), Munich, Germany, pages 222-231, IEEE Computer Society, 2008
</ul>

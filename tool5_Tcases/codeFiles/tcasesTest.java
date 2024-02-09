
  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 0. run (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> Standard </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_0()
    {
    // properties = isJUnit,outDir,outDirExists,outFile,params,testFileExists,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = No
    //
    //   genFile.path.isAbsolute = (not applicable)
    //
    //   genFile.path.exists = (not applicable)
    //
    //   genFile.default = Standard
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = Yes
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = Yes
    //
    //   outDir.path.isDirectory = Yes
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = No
    //
    //   seed.isNumber = (not applicable)
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = Yes
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 1. run (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> ForInputExists </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> No </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> None </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> withInputXml </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_1()
    {
    // properties = defaultTupleSize,inFile,outFile,outFileExists,random,testFile,transform,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = Yes
    //
    //   defaultTupleSize.isNumber = Yes
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = No
    //
    //   outFile.path.exists = Yes
    //
    //   genFile.defined = No
    //
    //   genFile.path.isAbsolute = (not applicable)
    //
    //   genFile.path.exists = (not applicable)
    //
    //   genFile.default = ForInputExists
    //
    //   isJUnit = No
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = No
    //
    //   outDir.path.exists = (not applicable)
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = None
    //
    //   transformParams.assignsValue = (not applicable)
    //
    //   transformParams.nameDefined = (not applicable)
    //
    //   transformParams.valueDefined = (not applicable)
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = Yes
    //
    //   testFile.path.isAbsolute = Yes
    //
    //   testFile.path.exists = No
    //
    //   testFile.default.exists = (not applicable)
    //
    //   transform.defined = Yes
    //
    //   transform.path.isAbsolute = No
    //
    //   transform.path.exists = Yes
    //
    //   inFile.defined = Yes
    //
    //   inFile.path.isAbsolute = Yes
    //
    //   inFile.path.exists = withInputXml
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 2. run (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> Many </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_2()
    {
    // properties = genFile,isJUnit,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = No
    //
    //   outDir.path.exists = (not applicable)
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = Many
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = Yes
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 3. run (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> No </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> withXml </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_3()
    {
    // properties = defaultTupleSize,genFile,inFile,outDir,outFile,outFileExists,params,testFile,testFileExists,transform,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = Yes
    //
    //   defaultTupleSize.isNumber = Yes
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = No
    //
    //   outFile.path.exists = Yes
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = No
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = No
    //
    //   newTests.defined = No
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = No
    //
    //   seed.isNumber = (not applicable)
    //
    //   testFile.defined = Yes
    //
    //   testFile.path.isAbsolute = No
    //
    //   testFile.path.exists = Yes
    //
    //   testFile.default.exists = (not applicable)
    //
    //   transform.defined = Yes
    //
    //   transform.path.isAbsolute = Yes
    //
    //   transform.path.exists = Yes
    //
    //   inFile.defined = Yes
    //
    //   inFile.path.isAbsolute = No
    //
    //   inFile.path.exists = withXml
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 4. run (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> ForInputNone </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> None </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> asDefined </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_4()
    {
    // properties = inFile,isJUnit,outDir,outDirExists,testFileExists,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = No
    //
    //   outFile.path.isAbsolute = (not applicable)
    //
    //   outFile.path.exists = (not applicable)
    //
    //   genFile.defined = No
    //
    //   genFile.path.isAbsolute = (not applicable)
    //
    //   genFile.path.exists = (not applicable)
    //
    //   genFile.default = ForInputNone
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = Yes
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = Yes
    //
    //   outDir.path.isDirectory = Yes
    //
    //   transformParams.count = None
    //
    //   transformParams.assignsValue = (not applicable)
    //
    //   transformParams.nameDefined = (not applicable)
    //
    //   transformParams.valueDefined = (not applicable)
    //
    //   seed.defined = No
    //
    //   seed.isNumber = (not applicable)
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = Yes
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = Yes
    //
    //   inFile.path.isAbsolute = Yes
    //
    //   inFile.path.exists = asDefined
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 5. run (Success) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> Standard </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> No </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> Many </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_5()
    {
    // properties = defaultTupleSize,params,random,testFile,transform,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = Yes
    //
    //   defaultTupleSize.isNumber = Yes
    //
    //   outFile.defined = No
    //
    //   outFile.path.isAbsolute = (not applicable)
    //
    //   outFile.path.exists = (not applicable)
    //
    //   genFile.defined = No
    //
    //   genFile.path.isAbsolute = (not applicable)
    //
    //   genFile.path.exists = (not applicable)
    //
    //   genFile.default = Standard
    //
    //   isJUnit = No
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = No
    //
    //   outDir.path.exists = (not applicable)
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = Many
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = Yes
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = Yes
    //
    //   testFile.path.isAbsolute = Yes
    //
    //   testFile.path.exists = No
    //
    //   testFile.default.exists = (not applicable)
    //
    //   transform.defined = Yes
    //
    //   transform.path.isAbsolute = No
    //
    //   transform.path.exists = Yes
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 6. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> No </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_6()
    {
    // properties = genFile,outDir,outFile,params,random,transform,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = No
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = Yes
    //
    //   transform.path.isAbsolute = Yes
    //
    //   transform.path.exists = No
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 7. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_7()
    {
    // properties = genFile,isJUnit,outDir,outDirExists,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = Yes
    //
    //   outDir.path.isDirectory = No
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 8. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_8()
    {
    // properties = genFile,isJUnit,outDir,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = No
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 9. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> <FONT color="red"> NotAllowed  </FONT> </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_9()
    {
    // properties = genFile,outDir,outFile,params,random,transform,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = NotAllowed
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = Yes
    //
    //   transform.path.isAbsolute = Yes
    //
    //   transform.path.exists = Yes
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 10. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_10()
    {
    // properties = genFile,inFile,isJUnit,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = No
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = No
    //
    //   outDir.path.exists = (not applicable)
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = Yes
    //
    //   inFile.path.isAbsolute = No
    //
    //   inFile.path.exists = No
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 11. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_11()
    {
    // properties = genFile,isJUnit,outDir,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = No
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 12. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_12()
    {
    // properties = genFile,isJUnit,outDir,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = No
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 13. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_13()
    {
    // properties = defaultTupleSize,genFile,isJUnit,outDir,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = Yes
    //
    //   defaultTupleSize.isNumber = No
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 14. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> <FONT color="red"> No  </FONT> </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_14()
    {
    // properties = genFile,isJUnit,outDir,outFile,params,random,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = Yes
    //
    //   outFile.path.isAbsolute = Yes
    //
    //   outFile.path.exists = No
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = (not applicable)
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = No
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = No
    //
    //   testFile.path.isAbsolute = (not applicable)
    //
    //   testFile.path.exists = (not applicable)
    //
    //   testFile.default.exists = No
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = No
    //
    //   inFile.path.isAbsolute = (not applicable)
    //
    //   inFile.path.exists = (not applicable)
    
    // When...

    // Then...
    }

  /**
   * Tests {@link Tcases#run run()} using the following inputs.
   * <P>
   * <TABLE border="1" cellpadding="8">
   * <TR align="left"><TH colspan=2> 15. run (<FONT color="red">Failure</FONT>) </TH></TR>
   * <TR align="left"><TH> Input Choice </TH> <TH> Value </TH></TR>
   * <TR><TD> defaultTupleSize.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> defaultTupleSize.isNumber </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.defined </TD> <TD> <FONT color="red"> TransformOutputUndefined  </FONT> </TD> </TR>
   * <TR><TD> outFile.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> outFile.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> genFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.isAbsolute </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> genFile.default </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> isJUnit </TD> <TD> Yes </TD> </TR>
   * <TR><TD> newTests.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> outDir.path.exists </TD> <TD> No </TD> </TR>
   * <TR><TD> outDir.path.isDirectory </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transformParams.count </TD> <TD> One </TD> </TR>
   * <TR><TD> transformParams.assignsValue </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.nameDefined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> transformParams.valueDefined </TD> <TD> No </TD> </TR>
   * <TR><TD> seed.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> seed.isNumber </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> testFile.path.exists </TD> <TD> Yes </TD> </TR>
   * <TR><TD> testFile.default.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.defined </TD> <TD> No </TD> </TR>
   * <TR><TD> transform.path.isAbsolute </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> transform.path.exists </TD> <TD> (not applicable) </TD> </TR>
   * <TR><TD> inFile.defined </TD> <TD> Yes </TD> </TR>
   * <TR><TD> inFile.path.isAbsolute </TD> <TD> No </TD> </TR>
   * <TR><TD> inFile.path.exists </TD> <TD> withInputXml </TD> </TR>
   * </TABLE>
   * </P>
   */
  @Test
  public void run_15()
    {
    // properties = genFile,inFile,isJUnit,outDir,params,random,testFile,testFileExists,transformedOut

    // Given...
    //
    //   defaultTupleSize.defined = No
    //
    //   defaultTupleSize.isNumber = (not applicable)
    //
    //   outFile.defined = TransformOutputUndefined
    //
    //   outFile.path.isAbsolute = (not applicable)
    //
    //   outFile.path.exists = (not applicable)
    //
    //   genFile.defined = Yes
    //
    //   genFile.path.isAbsolute = Yes
    //
    //   genFile.path.exists = Yes
    //
    //   genFile.default = (not applicable)
    //
    //   isJUnit = Yes
    //
    //   newTests.defined = No
    //
    //   outDir.defined = Yes
    //
    //   outDir.path.exists = No
    //
    //   outDir.path.isDirectory = (not applicable)
    //
    //   transformParams.count = One
    //
    //   transformParams.assignsValue = Yes
    //
    //   transformParams.nameDefined = Yes
    //
    //   transformParams.valueDefined = No
    //
    //   seed.defined = Yes
    //
    //   seed.isNumber = Yes
    //
    //   testFile.defined = Yes
    //
    //   testFile.path.isAbsolute = No
    //
    //   testFile.path.exists = Yes
    //
    //   testFile.default.exists = (not applicable)
    //
    //   transform.defined = No
    //
    //   transform.path.isAbsolute = (not applicable)
    //
    //   transform.path.exists = (not applicable)
    //
    //   inFile.defined = Yes
    //
    //   inFile.path.isAbsolute = No
    //
    //   inFile.path.exists = withInputXml
    
    // When...

    // Then...
    }

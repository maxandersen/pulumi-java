// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TestCaseReferenceResponse {
    /**
     * The name of the class.
     * 
     */
    private final String className;
    /**
     * The name of the test case. Required.
     * 
     */
    private final String name;
    /**
     * The name of the test suite to which this test case belongs.
     * 
     */
    private final String testSuiteName;

    @OutputCustomType.Constructor
    private TestCaseReferenceResponse(
        @OutputCustomType.Parameter("className") String className,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("testSuiteName") String testSuiteName) {
        this.className = className;
        this.name = name;
        this.testSuiteName = testSuiteName;
    }

    /**
     * The name of the class.
     * 
    */
    public String getClassName() {
        return this.className;
    }
    /**
     * The name of the test case. Required.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the test suite to which this test case belongs.
     * 
    */
    public String getTestSuiteName() {
        return this.testSuiteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestCaseReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String className;
        private String name;
        private String testSuiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(TestCaseReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.className = defaults.className;
    	      this.name = defaults.name;
    	      this.testSuiteName = defaults.testSuiteName;
        }

        public Builder setClassName(String className) {
            this.className = Objects.requireNonNull(className);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTestSuiteName(String testSuiteName) {
            this.testSuiteName = Objects.requireNonNull(testSuiteName);
            return this;
        }
        public TestCaseReferenceResponse build() {
            return new TestCaseReferenceResponse(className, name, testSuiteName);
        }
    }
}

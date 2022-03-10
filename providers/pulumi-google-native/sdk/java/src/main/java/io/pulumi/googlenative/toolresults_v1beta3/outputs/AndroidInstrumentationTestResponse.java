// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AndroidInstrumentationTestResponse {
    /**
     * The java package for the test to be executed. Required
     * 
     */
    private final String testPackageId;
    /**
     * The InstrumentationTestRunner class. Required
     * 
     */
    private final String testRunnerClass;
    /**
     * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class package_name.class_name#method_name" If empty, all targets in the module will be run.
     * 
     */
    private final List<String> testTargets;
    /**
     * The flag indicates whether Android Test Orchestrator will be used to run test or not.
     * 
     */
    private final Boolean useOrchestrator;

    @OutputCustomType.Constructor
    private AndroidInstrumentationTestResponse(
        @OutputCustomType.Parameter("testPackageId") String testPackageId,
        @OutputCustomType.Parameter("testRunnerClass") String testRunnerClass,
        @OutputCustomType.Parameter("testTargets") List<String> testTargets,
        @OutputCustomType.Parameter("useOrchestrator") Boolean useOrchestrator) {
        this.testPackageId = testPackageId;
        this.testRunnerClass = testRunnerClass;
        this.testTargets = testTargets;
        this.useOrchestrator = useOrchestrator;
    }

    /**
     * The java package for the test to be executed. Required
     * 
    */
    public String getTestPackageId() {
        return this.testPackageId;
    }
    /**
     * The InstrumentationTestRunner class. Required
     * 
    */
    public String getTestRunnerClass() {
        return this.testRunnerClass;
    }
    /**
     * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class package_name.class_name#method_name" If empty, all targets in the module will be run.
     * 
    */
    public List<String> getTestTargets() {
        return this.testTargets;
    }
    /**
     * The flag indicates whether Android Test Orchestrator will be used to run test or not.
     * 
    */
    public Boolean getUseOrchestrator() {
        return this.useOrchestrator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidInstrumentationTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String testPackageId;
        private String testRunnerClass;
        private List<String> testTargets;
        private Boolean useOrchestrator;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidInstrumentationTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testPackageId = defaults.testPackageId;
    	      this.testRunnerClass = defaults.testRunnerClass;
    	      this.testTargets = defaults.testTargets;
    	      this.useOrchestrator = defaults.useOrchestrator;
        }

        public Builder setTestPackageId(String testPackageId) {
            this.testPackageId = Objects.requireNonNull(testPackageId);
            return this;
        }

        public Builder setTestRunnerClass(String testRunnerClass) {
            this.testRunnerClass = Objects.requireNonNull(testRunnerClass);
            return this;
        }

        public Builder setTestTargets(List<String> testTargets) {
            this.testTargets = Objects.requireNonNull(testTargets);
            return this;
        }

        public Builder setUseOrchestrator(Boolean useOrchestrator) {
            this.useOrchestrator = Objects.requireNonNull(useOrchestrator);
            return this;
        }
        public AndroidInstrumentationTestResponse build() {
            return new AndroidInstrumentationTestResponse(testPackageId, testRunnerClass, testTargets, useOrchestrator);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * The name of the environment. Format: `projects//locations//agents//environments/`.
     * 
     */
    private final String name;
    /**
     * The test cases config for continuous tests of this environment.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse testCasesConfig;
    /**
     * Update time of this environment.
     * 
     */
    private final String updateTime;
    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse> versionConfigs;

    @OutputCustomType.Constructor
    private GetEnvironmentResult(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("testCasesConfig") GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse testCasesConfig,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("versionConfigs") List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse> versionConfigs) {
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.testCasesConfig = testCasesConfig;
        this.updateTime = updateTime;
        this.versionConfigs = versionConfigs;
    }

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The name of the environment. Format: `projects//locations//agents//environments/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The test cases config for continuous tests of this environment.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse getTestCasesConfig() {
        return this.testCasesConfig;
    }
    /**
     * Update time of this environment.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse> getVersionConfigs() {
        return this.versionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private String name;
        private GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse testCasesConfig;
        private String updateTime;
        private List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse> versionConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.testCasesConfig = defaults.testCasesConfig;
    	      this.updateTime = defaults.updateTime;
    	      this.versionConfigs = defaults.versionConfigs;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTestCasesConfig(GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse testCasesConfig) {
            this.testCasesConfig = Objects.requireNonNull(testCasesConfig);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVersionConfigs(List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse> versionConfigs) {
            this.versionConfigs = Objects.requireNonNull(versionConfigs);
            return this;
        }
        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(description, displayName, name, testCasesConfig, updateTime, versionConfigs);
        }
    }
}

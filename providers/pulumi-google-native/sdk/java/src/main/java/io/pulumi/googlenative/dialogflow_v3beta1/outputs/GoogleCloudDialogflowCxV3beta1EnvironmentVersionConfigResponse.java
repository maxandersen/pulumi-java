// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse {
    /**
     * Format: projects//locations//agents//flows//versions/.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse(@CustomType.Parameter("version") String version) {
        this.version = version;
    }

    /**
     * Format: projects//locations//agents//flows//versions/.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse(version);
        }
    }
}

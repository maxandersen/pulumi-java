// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConfigFileResponse {
    /**
     * The contents of the file.
     * 
     */
    private final String content;

    @OutputCustomType.Constructor
    private ConfigFileResponse(@OutputCustomType.Parameter("content") String content) {
        this.content = content;
    }

    /**
     * The contents of the file.
     * 
    */
    public String getContent() {
        return this.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public ConfigFileResponse build() {
            return new ConfigFileResponse(content);
        }
    }
}

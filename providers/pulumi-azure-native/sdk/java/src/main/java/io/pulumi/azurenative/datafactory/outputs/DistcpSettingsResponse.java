// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistcpSettingsResponse {
    /**
     * Specifies the Distcp options. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object distcpOptions;
    /**
     * Specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final Object resourceManagerEndpoint;
    /**
     * Specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     * 
     */
    private final Object tempScriptPath;

    @CustomType.Constructor
    private DistcpSettingsResponse(
        @CustomType.Parameter("distcpOptions") @Nullable Object distcpOptions,
        @CustomType.Parameter("resourceManagerEndpoint") Object resourceManagerEndpoint,
        @CustomType.Parameter("tempScriptPath") Object tempScriptPath) {
        this.distcpOptions = distcpOptions;
        this.resourceManagerEndpoint = resourceManagerEndpoint;
        this.tempScriptPath = tempScriptPath;
    }

    /**
     * Specifies the Distcp options. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> distcpOptions() {
        return Optional.ofNullable(this.distcpOptions);
    }
    /**
     * Specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     * 
    */
    public Object resourceManagerEndpoint() {
        return this.resourceManagerEndpoint;
    }
    /**
     * Specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     * 
    */
    public Object tempScriptPath() {
        return this.tempScriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistcpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object distcpOptions;
        private Object resourceManagerEndpoint;
        private Object tempScriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DistcpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distcpOptions = defaults.distcpOptions;
    	      this.resourceManagerEndpoint = defaults.resourceManagerEndpoint;
    	      this.tempScriptPath = defaults.tempScriptPath;
        }

        public Builder distcpOptions(@Nullable Object distcpOptions) {
            this.distcpOptions = distcpOptions;
            return this;
        }
        public Builder resourceManagerEndpoint(Object resourceManagerEndpoint) {
            this.resourceManagerEndpoint = Objects.requireNonNull(resourceManagerEndpoint);
            return this;
        }
        public Builder tempScriptPath(Object tempScriptPath) {
            this.tempScriptPath = Objects.requireNonNull(tempScriptPath);
            return this;
        }        public DistcpSettingsResponse build() {
            return new DistcpSettingsResponse(distcpOptions, resourceManagerEndpoint, tempScriptPath);
        }
    }
}

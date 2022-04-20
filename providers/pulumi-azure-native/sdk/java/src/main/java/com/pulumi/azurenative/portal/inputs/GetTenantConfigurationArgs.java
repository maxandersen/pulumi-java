// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTenantConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTenantConfigurationArgs Empty = new GetTenantConfigurationArgs();

    /**
     * The configuration name. Value must be &#39;default&#39;
     * 
     */
    @Import(name="configurationName", required=true)
      private final String configurationName;

    public String configurationName() {
        return this.configurationName;
    }

    public GetTenantConfigurationArgs(String configurationName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
    }

    private GetTenantConfigurationArgs() {
        this.configurationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTenantConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
        }

        public Builder configurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }        public GetTenantConfigurationArgs build() {
            return new GetTenantConfigurationArgs(configurationName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetTenantConfigurationArgs extends InvokeArgs {

    public static final GetTenantConfigurationArgs Empty = new GetTenantConfigurationArgs();

    /**
     * The configuration name. Value must be &#39;default&#39;
     * 
     */
    @Import(name="configurationName", required=true)
    private String configurationName;

    /**
     * @return The configuration name. Value must be &#39;default&#39;
     * 
     */
    public String configurationName() {
        return this.configurationName;
    }

    private GetTenantConfigurationArgs() {}

    private GetTenantConfigurationArgs(GetTenantConfigurationArgs $) {
        this.configurationName = $.configurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTenantConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTenantConfigurationArgs $;

        public Builder() {
            $ = new GetTenantConfigurationArgs();
        }

        public Builder(GetTenantConfigurationArgs defaults) {
            $ = new GetTenantConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The configuration name. Value must be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        public GetTenantConfigurationArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            return $;
        }
    }

}

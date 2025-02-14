// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppFirewallArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppFirewallArgs Empty = new GetWebAppFirewallArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewall.
     * 
     */
    @Import(name="webAppFirewallId", required=true)
    private String webAppFirewallId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewall.
     * 
     */
    public String webAppFirewallId() {
        return this.webAppFirewallId;
    }

    private GetWebAppFirewallArgs() {}

    private GetWebAppFirewallArgs(GetWebAppFirewallArgs $) {
        this.webAppFirewallId = $.webAppFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppFirewallArgs $;

        public Builder() {
            $ = new GetWebAppFirewallArgs();
        }

        public Builder(GetWebAppFirewallArgs defaults) {
            $ = new GetWebAppFirewallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param webAppFirewallId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WebAppFirewall.
         * 
         * @return builder
         * 
         */
        public Builder webAppFirewallId(String webAppFirewallId) {
            $.webAppFirewallId = webAppFirewallId;
            return this;
        }

        public GetWebAppFirewallArgs build() {
            $.webAppFirewallId = Objects.requireNonNull($.webAppFirewallId, "expected parameter 'webAppFirewallId' to be non-null");
            return $;
        }
    }

}

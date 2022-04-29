// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetServerTrustCertificateArgs extends InvokeArgs {

    public static final GetServerTrustCertificateArgs Empty = new GetServerTrustCertificateArgs();

    /**
     * Name of of the certificate to get.
     * 
     */
    @Import(name="certificateName", required=true)
    private String certificateName;

    /**
     * @return Name of of the certificate to get.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private String managedInstanceName;

    /**
     * @return The name of the managed instance.
     * 
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetServerTrustCertificateArgs() {}

    private GetServerTrustCertificateArgs(GetServerTrustCertificateArgs $) {
        this.certificateName = $.certificateName;
        this.managedInstanceName = $.managedInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerTrustCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerTrustCertificateArgs $;

        public Builder() {
            $ = new GetServerTrustCertificateArgs();
        }

        public Builder(GetServerTrustCertificateArgs defaults) {
            $ = new GetServerTrustCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName Name of of the certificate to get.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetServerTrustCertificateArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings to enable AAD authentication on the cluster.
 * 
 */
public final class AzureActiveDirectoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureActiveDirectoryResponse Empty = new AzureActiveDirectoryResponse();

    /**
     * Azure active directory client application id.
     * 
     */
    @Import(name="clientApplication")
    private @Nullable String clientApplication;

    public Optional<String> clientApplication() {
        return Optional.ofNullable(this.clientApplication);
    }

    /**
     * Azure active directory cluster application id.
     * 
     */
    @Import(name="clusterApplication")
    private @Nullable String clusterApplication;

    public Optional<String> clusterApplication() {
        return Optional.ofNullable(this.clusterApplication);
    }

    /**
     * Azure active directory tenant id.
     * 
     */
    @Import(name="tenantId")
    private @Nullable String tenantId;

    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private AzureActiveDirectoryResponse() {}

    private AzureActiveDirectoryResponse(AzureActiveDirectoryResponse $) {
        this.clientApplication = $.clientApplication;
        this.clusterApplication = $.clusterApplication;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureActiveDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryResponse $;

        public Builder() {
            $ = new AzureActiveDirectoryResponse();
        }

        public Builder(AzureActiveDirectoryResponse defaults) {
            $ = new AzureActiveDirectoryResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientApplication(@Nullable String clientApplication) {
            $.clientApplication = clientApplication;
            return this;
        }

        public Builder clusterApplication(@Nullable String clusterApplication) {
            $.clusterApplication = clusterApplication;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public AzureActiveDirectoryResponse build() {
            return $;
        }
    }

}

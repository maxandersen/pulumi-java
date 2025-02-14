// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyFragmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyFragmentArgs Empty = new GetPolicyFragmentArgs();

    /**
     * Policy fragment content format.
     * 
     */
    @Import(name="format")
    private @Nullable String format;

    /**
     * @return Policy fragment content format.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * A resource identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return A resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetPolicyFragmentArgs() {}

    private GetPolicyFragmentArgs(GetPolicyFragmentArgs $) {
        this.format = $.format;
        this.id = $.id;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyFragmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyFragmentArgs $;

        public Builder() {
            $ = new GetPolicyFragmentArgs();
        }

        public Builder(GetPolicyFragmentArgs defaults) {
            $ = new GetPolicyFragmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Policy fragment content format.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        /**
         * @param id A resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetPolicyFragmentArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}

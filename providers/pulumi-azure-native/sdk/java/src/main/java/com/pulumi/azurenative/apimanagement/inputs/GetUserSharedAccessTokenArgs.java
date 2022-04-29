// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.enums.KeyType;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetUserSharedAccessTokenArgs extends InvokeArgs {

    public static final GetUserSharedAccessTokenArgs Empty = new GetUserSharedAccessTokenArgs();

    /**
     * The Expiry time of the Token. Maximum token expiry time is set to 30 days. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Import(name="expiry", required=true)
    private String expiry;

    /**
     * @return The Expiry time of the Token. Maximum token expiry time is set to 30 days. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public String expiry() {
        return this.expiry;
    }

    /**
     * The Key to be used to generate token for user.
     * 
     */
    @Import(name="keyType", required=true)
    private KeyType keyType;

    /**
     * @return The Key to be used to generate token for user.
     * 
     */
    public KeyType keyType() {
        return this.keyType;
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

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return User identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String userId() {
        return this.userId;
    }

    private GetUserSharedAccessTokenArgs() {}

    private GetUserSharedAccessTokenArgs(GetUserSharedAccessTokenArgs $) {
        this.expiry = $.expiry;
        this.keyType = $.keyType;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserSharedAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserSharedAccessTokenArgs $;

        public Builder() {
            $ = new GetUserSharedAccessTokenArgs();
        }

        public Builder(GetUserSharedAccessTokenArgs defaults) {
            $ = new GetUserSharedAccessTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiry The Expiry time of the Token. Maximum token expiry time is set to 30 days. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param keyType The Key to be used to generate token for user.
         * 
         * @return builder
         * 
         */
        public Builder keyType(KeyType keyType) {
            $.keyType = keyType;
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

        /**
         * @param userId User identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetUserSharedAccessTokenArgs build() {
            $.expiry = Objects.requireNonNull($.expiry, "expected parameter 'expiry' to be non-null");
            $.keyType = Codegen.objectProp("keyType", KeyType.class).arg($.keyType).def(KeyType.Primary).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterPropertiesIdentityProfileArgs extends ResourceArgs {

    public static final ManagedClusterPropertiesIdentityProfileArgs Empty = new ManagedClusterPropertiesIdentityProfileArgs();

    /**
     * The client id of the user assigned identity.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client id of the user assigned identity.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The object id of the user assigned identity.
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<String> objectId;

    /**
     * @return The object id of the user assigned identity.
     * 
     */
    public Optional<Output<String>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The resource id of the user assigned identity.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The resource id of the user assigned identity.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private ManagedClusterPropertiesIdentityProfileArgs() {}

    private ManagedClusterPropertiesIdentityProfileArgs(ManagedClusterPropertiesIdentityProfileArgs $) {
        this.clientId = $.clientId;
        this.objectId = $.objectId;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterPropertiesIdentityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterPropertiesIdentityProfileArgs $;

        public Builder() {
            $ = new ManagedClusterPropertiesIdentityProfileArgs();
        }

        public Builder(ManagedClusterPropertiesIdentityProfileArgs defaults) {
            $ = new ManagedClusterPropertiesIdentityProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client id of the user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client id of the user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param objectId The object id of the user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The object id of the user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param resourceId The resource id of the user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The resource id of the user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public ManagedClusterPropertiesIdentityProfileArgs build() {
            return $;
        }
    }

}

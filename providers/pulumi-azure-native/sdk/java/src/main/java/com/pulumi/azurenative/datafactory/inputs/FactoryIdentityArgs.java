// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.FactoryIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity properties of the factory resource.
 * 
 */
public final class FactoryIdentityArgs extends ResourceArgs {

    public static final FactoryIdentityArgs Empty = new FactoryIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,FactoryIdentityType>> type;

    /**
     * @return The identity type.
     * 
     */
    public Output<Either<String,FactoryIdentityType>> type() {
        return this.type;
    }

    /**
     * List of user assigned identities for the factory.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    /**
     * @return List of user assigned identities for the factory.
     * 
     */
    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private FactoryIdentityArgs() {}

    private FactoryIdentityArgs(FactoryIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FactoryIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FactoryIdentityArgs $;

        public Builder() {
            $ = new FactoryIdentityArgs();
        }

        public Builder(FactoryIdentityArgs defaults) {
            $ = new FactoryIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,FactoryIdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,FactoryIdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(FactoryIdentityType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param userAssignedIdentities List of user assigned identities for the factory.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities List of user assigned identities for the factory.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public FactoryIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}

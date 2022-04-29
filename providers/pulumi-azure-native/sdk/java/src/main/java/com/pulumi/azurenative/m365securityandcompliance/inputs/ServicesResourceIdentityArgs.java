// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.azurenative.m365securityandcompliance.enums.ManagedServiceIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Setting indicating whether the service has a managed identity associated with it.
 * 
 */
public final class ServicesResourceIdentityArgs extends ResourceArgs {

    public static final ServicesResourceIdentityArgs Empty = new ServicesResourceIdentityArgs();

    /**
     * Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ManagedServiceIdentityType>> type;

    /**
     * @return Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    public Optional<Output<Either<String,ManagedServiceIdentityType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServicesResourceIdentityArgs() {}

    private ServicesResourceIdentityArgs(ServicesResourceIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicesResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicesResourceIdentityArgs $;

        public Builder() {
            $ = new ServicesResourceIdentityArgs();
        }

        public Builder(ServicesResourceIdentityArgs defaults) {
            $ = new ServicesResourceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of identity being specified, currently SystemAssigned and None are allowed.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ManagedServiceIdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of identity being specified, currently SystemAssigned and None are allowed.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ManagedServiceIdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Type of identity being specified, currently SystemAssigned and None are allowed.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Type of identity being specified, currently SystemAssigned and None are allowed.
         * 
         * @return builder
         * 
         */
        public Builder type(ManagedServiceIdentityType type) {
            return type(Either.ofRight(type));
        }

        public ServicesResourceIdentityArgs build() {
            return $;
        }
    }

}

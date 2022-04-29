// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ExpressRouteLinkAdminState;
import com.pulumi.azurenative.network.inputs.ExpressRouteLinkMacSecConfigArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ExpressRouteLink child resource definition.
 * 
 */
public final class ExpressRouteLinkArgs extends ResourceArgs {

    public static final ExpressRouteLinkArgs Empty = new ExpressRouteLinkArgs();

    /**
     * Administrative state of the physical port.
     * 
     */
    @Import(name="adminState")
    private @Nullable Output<Either<String,ExpressRouteLinkAdminState>> adminState;

    /**
     * @return Administrative state of the physical port.
     * 
     */
    public Optional<Output<Either<String,ExpressRouteLinkAdminState>>> adminState() {
        return Optional.ofNullable(this.adminState);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * MacSec configuration.
     * 
     */
    @Import(name="macSecConfig")
    private @Nullable Output<ExpressRouteLinkMacSecConfigArgs> macSecConfig;

    /**
     * @return MacSec configuration.
     * 
     */
    public Optional<Output<ExpressRouteLinkMacSecConfigArgs>> macSecConfig() {
        return Optional.ofNullable(this.macSecConfig);
    }

    /**
     * Name of child port resource that is unique among child port resources of the parent.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of child port resource that is unique among child port resources of the parent.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ExpressRouteLinkArgs() {}

    private ExpressRouteLinkArgs(ExpressRouteLinkArgs $) {
        this.adminState = $.adminState;
        this.id = $.id;
        this.macSecConfig = $.macSecConfig;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteLinkArgs $;

        public Builder() {
            $ = new ExpressRouteLinkArgs();
        }

        public Builder(ExpressRouteLinkArgs defaults) {
            $ = new ExpressRouteLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminState Administrative state of the physical port.
         * 
         * @return builder
         * 
         */
        public Builder adminState(@Nullable Output<Either<String,ExpressRouteLinkAdminState>> adminState) {
            $.adminState = adminState;
            return this;
        }

        /**
         * @param adminState Administrative state of the physical port.
         * 
         * @return builder
         * 
         */
        public Builder adminState(Either<String,ExpressRouteLinkAdminState> adminState) {
            return adminState(Output.of(adminState));
        }

        /**
         * @param adminState Administrative state of the physical port.
         * 
         * @return builder
         * 
         */
        public Builder adminState(String adminState) {
            return adminState(Either.ofLeft(adminState));
        }

        /**
         * @param adminState Administrative state of the physical port.
         * 
         * @return builder
         * 
         */
        public Builder adminState(ExpressRouteLinkAdminState adminState) {
            return adminState(Either.ofRight(adminState));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param macSecConfig MacSec configuration.
         * 
         * @return builder
         * 
         */
        public Builder macSecConfig(@Nullable Output<ExpressRouteLinkMacSecConfigArgs> macSecConfig) {
            $.macSecConfig = macSecConfig;
            return this;
        }

        /**
         * @param macSecConfig MacSec configuration.
         * 
         * @return builder
         * 
         */
        public Builder macSecConfig(ExpressRouteLinkMacSecConfigArgs macSecConfig) {
            return macSecConfig(Output.of(macSecConfig));
        }

        /**
         * @param name Name of child port resource that is unique among child port resources of the parent.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of child port resource that is unique among child port resources of the parent.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ExpressRouteLinkArgs build() {
            return $;
        }
    }

}

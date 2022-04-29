// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a container endpoint.
 * 
 */
public final class EndpointPropertiesArgs extends ResourceArgs {

    public static final EndpointPropertiesArgs Empty = new EndpointPropertiesArgs();

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Port used by the container.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port used by the container.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private EndpointPropertiesArgs() {}

    private EndpointPropertiesArgs(EndpointPropertiesArgs $) {
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointPropertiesArgs $;

        public Builder() {
            $ = new EndpointPropertiesArgs();
        }

        public Builder(EndpointPropertiesArgs defaults) {
            $ = new EndpointPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port Port used by the container.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port used by the container.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public EndpointPropertiesArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

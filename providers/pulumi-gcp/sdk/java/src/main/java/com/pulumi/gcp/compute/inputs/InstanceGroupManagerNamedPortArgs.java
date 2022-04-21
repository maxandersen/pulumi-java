// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerNamedPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerNamedPortArgs Empty = new InstanceGroupManagerNamedPortArgs();

    /**
     * - Version name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The port number.
     * ***
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    private InstanceGroupManagerNamedPortArgs() {}

    private InstanceGroupManagerNamedPortArgs(InstanceGroupManagerNamedPortArgs $) {
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerNamedPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerNamedPortArgs $;

        public Builder() {
            $ = new InstanceGroupManagerNamedPortArgs();
        }

        public Builder(InstanceGroupManagerNamedPortArgs defaults) {
            $ = new InstanceGroupManagerNamedPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public InstanceGroupManagerNamedPortArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}

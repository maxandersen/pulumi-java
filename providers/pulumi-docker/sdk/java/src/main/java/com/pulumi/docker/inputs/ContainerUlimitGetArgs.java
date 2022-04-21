// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ContainerUlimitGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerUlimitGetArgs Empty = new ContainerUlimitGetArgs();

    @Import(name="hard", required=true)
    private Output<Integer> hard;

    public Output<Integer> hard() {
        return this.hard;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="soft", required=true)
    private Output<Integer> soft;

    public Output<Integer> soft() {
        return this.soft;
    }

    private ContainerUlimitGetArgs() {}

    private ContainerUlimitGetArgs(ContainerUlimitGetArgs $) {
        this.hard = $.hard;
        this.name = $.name;
        this.soft = $.soft;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerUlimitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerUlimitGetArgs $;

        public Builder() {
            $ = new ContainerUlimitGetArgs();
        }

        public Builder(ContainerUlimitGetArgs defaults) {
            $ = new ContainerUlimitGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder hard(Output<Integer> hard) {
            $.hard = hard;
            return this;
        }

        public Builder hard(Integer hard) {
            return hard(Output.of(hard));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder soft(Output<Integer> soft) {
            $.soft = soft;
            return this;
        }

        public Builder soft(Integer soft) {
            return soft(Output.of(soft));
        }

        public ContainerUlimitGetArgs build() {
            $.hard = Objects.requireNonNull($.hard, "expected parameter 'hard' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.soft = Objects.requireNonNull($.soft, "expected parameter 'soft' to be non-null");
            return $;
        }
    }

}

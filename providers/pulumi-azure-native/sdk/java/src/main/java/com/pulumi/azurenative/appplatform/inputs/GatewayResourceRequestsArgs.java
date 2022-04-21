// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource request payload of Spring Cloud Gateway.
 * 
 */
public final class GatewayResourceRequestsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayResourceRequestsArgs Empty = new GatewayResourceRequestsArgs();

    /**
     * Cpu allocated to each Spring Cloud Gateway instance.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<String> cpu;

    public Optional<Output<String>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Memory allocated to each Spring Cloud Gateway instance.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<String> memory;

    public Optional<Output<String>> memory() {
        return Optional.ofNullable(this.memory);
    }

    private GatewayResourceRequestsArgs() {}

    private GatewayResourceRequestsArgs(GatewayResourceRequestsArgs $) {
        this.cpu = $.cpu;
        this.memory = $.memory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayResourceRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayResourceRequestsArgs $;

        public Builder() {
            $ = new GatewayResourceRequestsArgs();
        }

        public Builder(GatewayResourceRequestsArgs defaults) {
            $ = new GatewayResourceRequestsArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpu(@Nullable Output<String> cpu) {
            $.cpu = cpu;
            return this;
        }

        public Builder cpu(String cpu) {
            return cpu(Output.of(cpu));
        }

        public Builder memory(@Nullable Output<String> memory) {
            $.memory = memory;
            return this;
        }

        public Builder memory(String memory) {
            return memory(Output.of(memory));
        }

        public GatewayResourceRequestsArgs build() {
            return $;
        }
    }

}

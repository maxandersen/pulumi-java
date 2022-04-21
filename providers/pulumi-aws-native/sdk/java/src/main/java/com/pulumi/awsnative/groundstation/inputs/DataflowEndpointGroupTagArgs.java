// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupTagArgs Empty = new DataflowEndpointGroupTagArgs();

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DataflowEndpointGroupTagArgs() {}

    private DataflowEndpointGroupTagArgs(DataflowEndpointGroupTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataflowEndpointGroupTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataflowEndpointGroupTagArgs $;

        public Builder() {
            $ = new DataflowEndpointGroupTagArgs();
        }

        public Builder(DataflowEndpointGroupTagArgs defaults) {
            $ = new DataflowEndpointGroupTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DataflowEndpointGroupTagArgs build() {
            return $;
        }
    }

}

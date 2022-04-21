// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingStatusConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusConditionArgs Empty = new DomainMappingStatusConditionArgs();

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="reason")
    private @Nullable Output<String> reason;

    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DomainMappingStatusConditionArgs() {}

    private DomainMappingStatusConditionArgs(DomainMappingStatusConditionArgs $) {
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingStatusConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingStatusConditionArgs $;

        public Builder() {
            $ = new DomainMappingStatusConditionArgs();
        }

        public Builder(DomainMappingStatusConditionArgs defaults) {
            $ = new DomainMappingStatusConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DomainMappingStatusConditionArgs build() {
            return $;
        }
    }

}

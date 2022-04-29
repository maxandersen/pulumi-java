// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.TypedErrorInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtendedErrorInfoArgs extends ResourceArgs {

    public static final ExtendedErrorInfoArgs Empty = new ExtendedErrorInfoArgs();

    @Import(name="additionalInfo")
    private @Nullable Output<List<TypedErrorInfoArgs>> additionalInfo;

    public Optional<Output<List<TypedErrorInfoArgs>>> additionalInfo() {
        return Optional.ofNullable(this.additionalInfo);
    }

    @Import(name="code")
    private @Nullable Output<String> code;

    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    @Import(name="details")
    private @Nullable Output<List<ExtendedErrorInfoArgs>> details;

    public Optional<Output<List<ExtendedErrorInfoArgs>>> details() {
        return Optional.ofNullable(this.details);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private ExtendedErrorInfoArgs() {}

    private ExtendedErrorInfoArgs(ExtendedErrorInfoArgs $) {
        this.additionalInfo = $.additionalInfo;
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtendedErrorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtendedErrorInfoArgs $;

        public Builder() {
            $ = new ExtendedErrorInfoArgs();
        }

        public Builder(ExtendedErrorInfoArgs defaults) {
            $ = new ExtendedErrorInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalInfo(@Nullable Output<List<TypedErrorInfoArgs>> additionalInfo) {
            $.additionalInfo = additionalInfo;
            return this;
        }

        public Builder additionalInfo(List<TypedErrorInfoArgs> additionalInfo) {
            return additionalInfo(Output.of(additionalInfo));
        }

        public Builder additionalInfo(TypedErrorInfoArgs... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }

        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        public Builder code(String code) {
            return code(Output.of(code));
        }

        public Builder details(@Nullable Output<List<ExtendedErrorInfoArgs>> details) {
            $.details = details;
            return this;
        }

        public Builder details(List<ExtendedErrorInfoArgs> details) {
            return details(Output.of(details));
        }

        public Builder details(ExtendedErrorInfoArgs... details) {
            return details(List.of(details));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public ExtendedErrorInfoArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.TypedErrorInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExtendedErrorInfoResponse {
    private final @Nullable List<TypedErrorInfoResponse> additionalInfo;
    private final @Nullable String code;
    private final @Nullable List<ExtendedErrorInfoResponse> details;
    private final @Nullable String message;
    private final @Nullable String target;

    @CustomType.Constructor
    private ExtendedErrorInfoResponse(
        @CustomType.Parameter("additionalInfo") @Nullable List<TypedErrorInfoResponse> additionalInfo,
        @CustomType.Parameter("code") @Nullable String code,
        @CustomType.Parameter("details") @Nullable List<ExtendedErrorInfoResponse> details,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("target") @Nullable String target) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    public List<TypedErrorInfoResponse> additionalInfo() {
        return this.additionalInfo == null ? List.of() : this.additionalInfo;
    }
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    public List<ExtendedErrorInfoResponse> details() {
        return this.details == null ? List.of() : this.details;
    }
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TypedErrorInfoResponse> additionalInfo;
        private @Nullable String code;
        private @Nullable List<ExtendedErrorInfoResponse> details;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder additionalInfo(@Nullable List<TypedErrorInfoResponse> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public Builder additionalInfo(TypedErrorInfoResponse... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }
        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder details(@Nullable List<ExtendedErrorInfoResponse> details) {
            this.details = details;
            return this;
        }
        public Builder details(ExtendedErrorInfoResponse... details) {
            return details(List.of(details));
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public ExtendedErrorInfoResponse build() {
            return new ExtendedErrorInfoResponse(additionalInfo, code, details, message, target);
        }
    }
}

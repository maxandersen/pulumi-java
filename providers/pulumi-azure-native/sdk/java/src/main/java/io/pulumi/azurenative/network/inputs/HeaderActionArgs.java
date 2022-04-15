// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.HeaderActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An action that can manipulate an http header.
 * 
 */
public final class HeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HeaderActionArgs Empty = new HeaderActionArgs();

    /**
     * Which type of manipulation to apply to the header.
     * 
     */
    @Import(name="headerActionType", required=true)
      private final Output<Either<String,HeaderActionType>> headerActionType;

    public Output<Either<String,HeaderActionType>> headerActionType() {
        return this.headerActionType;
    }

    /**
     * The name of the header this action will apply to.
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * The value to update the given header name with. This value is not used if the actionType is Delete.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public HeaderActionArgs(
        Output<Either<String,HeaderActionType>> headerActionType,
        Output<String> headerName,
        @Nullable Output<String> value) {
        this.headerActionType = Objects.requireNonNull(headerActionType, "expected parameter 'headerActionType' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.value = value;
    }

    private HeaderActionArgs() {
        this.headerActionType = Codegen.empty();
        this.headerName = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,HeaderActionType>> headerActionType;
        private Output<String> headerName;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerActionType = defaults.headerActionType;
    	      this.headerName = defaults.headerName;
    	      this.value = defaults.value;
        }

        public Builder headerActionType(Output<Either<String,HeaderActionType>> headerActionType) {
            this.headerActionType = Objects.requireNonNull(headerActionType);
            return this;
        }
        public Builder headerActionType(Either<String,HeaderActionType> headerActionType) {
            this.headerActionType = Output.of(Objects.requireNonNull(headerActionType));
            return this;
        }
        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public HeaderActionArgs build() {
            return new HeaderActionArgs(headerActionType, headerName, value);
        }
    }
}

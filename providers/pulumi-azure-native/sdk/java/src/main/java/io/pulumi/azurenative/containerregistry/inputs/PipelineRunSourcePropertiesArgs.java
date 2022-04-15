// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.PipelineRunSourceType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineRunSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineRunSourcePropertiesArgs Empty = new PipelineRunSourcePropertiesArgs();

    /**
     * The name of the source.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The type of the source.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,PipelineRunSourceType>> type;

    public Output<Either<String,PipelineRunSourceType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public PipelineRunSourcePropertiesArgs(
        @Nullable Output<String> name,
        @Nullable Output<Either<String,PipelineRunSourceType>> type) {
        this.name = name;
        this.type = type == null ? Output.ofLeft("AzureStorageBlob") : type;
    }

    private PipelineRunSourcePropertiesArgs() {
        this.name = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,PipelineRunSourceType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,PipelineRunSourceType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,PipelineRunSourceType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public PipelineRunSourcePropertiesArgs build() {
            return new PipelineRunSourcePropertiesArgs(name, type);
        }
    }
}

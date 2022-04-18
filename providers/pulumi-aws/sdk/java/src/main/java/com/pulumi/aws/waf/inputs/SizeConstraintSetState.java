// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SizeConstraintSetState extends com.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetState Empty = new SizeConstraintSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @Import(name="sizeConstraints")
      private final @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

    public Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints() {
        return this.sizeConstraints == null ? Codegen.empty() : this.sizeConstraints;
    }

    public SizeConstraintSetState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
        this.arn = arn;
        this.name = name;
        this.sizeConstraints = sizeConstraints;
    }

    private SizeConstraintSetState() {
        this.arn = Codegen.empty();
        this.name = Codegen.empty();
        this.sizeConstraints = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.sizeConstraints = defaults.sizeConstraints;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder sizeConstraints(@Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
            this.sizeConstraints = sizeConstraints;
            return this;
        }
        public Builder sizeConstraints(@Nullable List<SizeConstraintSetSizeConstraintGetArgs> sizeConstraints) {
            this.sizeConstraints = Codegen.ofNullable(sizeConstraints);
            return this;
        }
        public Builder sizeConstraints(SizeConstraintSetSizeConstraintGetArgs... sizeConstraints) {
            return sizeConstraints(List.of(sizeConstraints));
        }        public SizeConstraintSetState build() {
            return new SizeConstraintSetState(arn, name, sizeConstraints);
        }
    }
}

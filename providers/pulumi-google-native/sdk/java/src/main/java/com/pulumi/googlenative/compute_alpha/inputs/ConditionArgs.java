// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.ConditionIam;
import com.pulumi.googlenative.compute_alpha.enums.ConditionOp;
import com.pulumi.googlenative.compute_alpha.enums.ConditionSys;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class ConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="iam")
      private final @Nullable Output<ConditionIam> iam;

    public Output<ConditionIam> iam() {
        return this.iam == null ? Codegen.empty() : this.iam;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="op")
      private final @Nullable Output<ConditionOp> op;

    public Output<ConditionOp> op() {
        return this.op == null ? Codegen.empty() : this.op;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="svc")
      private final @Nullable Output<String> svc;

    public Output<String> svc() {
        return this.svc == null ? Codegen.empty() : this.svc;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="sys")
      private final @Nullable Output<ConditionSys> sys;

    public Output<ConditionSys> sys() {
        return this.sys == null ? Codegen.empty() : this.sys;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public ConditionArgs(
        @Nullable Output<ConditionIam> iam,
        @Nullable Output<ConditionOp> op,
        @Nullable Output<String> svc,
        @Nullable Output<ConditionSys> sys,
        @Nullable Output<List<String>> values) {
        this.iam = iam;
        this.op = op;
        this.svc = svc;
        this.sys = sys;
        this.values = values;
    }

    private ConditionArgs() {
        this.iam = Codegen.empty();
        this.op = Codegen.empty();
        this.svc = Codegen.empty();
        this.sys = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConditionIam> iam;
        private @Nullable Output<ConditionOp> op;
        private @Nullable Output<String> svc;
        private @Nullable Output<ConditionSys> sys;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder iam(@Nullable Output<ConditionIam> iam) {
            this.iam = iam;
            return this;
        }
        public Builder iam(@Nullable ConditionIam iam) {
            this.iam = Codegen.ofNullable(iam);
            return this;
        }
        public Builder op(@Nullable Output<ConditionOp> op) {
            this.op = op;
            return this;
        }
        public Builder op(@Nullable ConditionOp op) {
            this.op = Codegen.ofNullable(op);
            return this;
        }
        public Builder svc(@Nullable Output<String> svc) {
            this.svc = svc;
            return this;
        }
        public Builder svc(@Nullable String svc) {
            this.svc = Codegen.ofNullable(svc);
            return this;
        }
        public Builder sys(@Nullable Output<ConditionSys> sys) {
            this.sys = sys;
            return this;
        }
        public Builder sys(@Nullable ConditionSys sys) {
            this.sys = Codegen.ofNullable(sys);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ConditionArgs build() {
            return new ConditionArgs(iam, op, svc, sys, values);
        }
    }
}

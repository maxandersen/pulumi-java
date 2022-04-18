// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.enums.ScopeType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Target scope for a given action rule. By default scope will be the subscription. User can also provide list of resource groups or list of resources from the scope subscription as well.
 * 
 */
public final class ScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScopeArgs Empty = new ScopeArgs();

    /**
     * type of target scope
     * 
     */
    @Import(name="scopeType")
      private final @Nullable Output<Either<String,ScopeType>> scopeType;

    public Output<Either<String,ScopeType>> scopeType() {
        return this.scopeType == null ? Codegen.empty() : this.scopeType;
    }

    /**
     * list of ARM IDs of the given scope type which will be the target of the given action rule.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public ScopeArgs(
        @Nullable Output<Either<String,ScopeType>> scopeType,
        @Nullable Output<List<String>> values) {
        this.scopeType = scopeType;
        this.values = values;
    }

    private ScopeArgs() {
        this.scopeType = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ScopeType>> scopeType;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scopeType = defaults.scopeType;
    	      this.values = defaults.values;
        }

        public Builder scopeType(@Nullable Output<Either<String,ScopeType>> scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Builder scopeType(@Nullable Either<String,ScopeType> scopeType) {
            this.scopeType = Codegen.ofNullable(scopeType);
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
        }        public ScopeArgs build() {
            return new ScopeArgs(scopeType, values);
        }
    }
}

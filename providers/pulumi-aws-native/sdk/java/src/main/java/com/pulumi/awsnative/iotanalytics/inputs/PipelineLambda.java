// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineLambda extends com.pulumi.resources.InvokeArgs {

    public static final PipelineLambda Empty = new PipelineLambda();

    @Import(name="batchSize", required=true)
      private final Integer batchSize;

    public Integer batchSize() {
        return this.batchSize;
    }

    @Import(name="lambdaName", required=true)
      private final String lambdaName;

    public String lambdaName() {
        return this.lambdaName;
    }

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="next")
      private final @Nullable String next;

    public Optional<String> next() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    public PipelineLambda(
        Integer batchSize,
        String lambdaName,
        String name,
        @Nullable String next) {
        this.batchSize = Objects.requireNonNull(batchSize, "expected parameter 'batchSize' to be non-null");
        this.lambdaName = Objects.requireNonNull(lambdaName, "expected parameter 'lambdaName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineLambda() {
        this.batchSize = null;
        this.lambdaName = null;
        this.name = null;
        this.next = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer batchSize;
        private String lambdaName;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.lambdaName = defaults.lambdaName;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder batchSize(Integer batchSize) {
            this.batchSize = Objects.requireNonNull(batchSize);
            return this;
        }
        public Builder lambdaName(String lambdaName) {
            this.lambdaName = Objects.requireNonNull(lambdaName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }        public PipelineLambda build() {
            return new PipelineLambda(batchSize, lambdaName, name, next);
        }
    }
}

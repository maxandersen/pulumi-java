// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MPI distribution configuration.
 * 
 */
public final class MpiArgs extends com.pulumi.resources.ResourceArgs {

    public static final MpiArgs Empty = new MpiArgs();

    /**
     * Enum to determine the job distribution type.
     * Expected value is &#39;Mpi&#39;.
     * 
     */
    @Import(name="distributionType", required=true)
      private final Output<String> distributionType;

    public Output<String> distributionType() {
        return this.distributionType;
    }

    /**
     * Number of processes per MPI node.
     * 
     */
    @Import(name="processCountPerInstance")
      private final @Nullable Output<Integer> processCountPerInstance;

    public Output<Integer> processCountPerInstance() {
        return this.processCountPerInstance == null ? Codegen.empty() : this.processCountPerInstance;
    }

    public MpiArgs(
        Output<String> distributionType,
        @Nullable Output<Integer> processCountPerInstance) {
        this.distributionType = Codegen.stringProp("distributionType").output().arg(distributionType).require();
        this.processCountPerInstance = processCountPerInstance;
    }

    private MpiArgs() {
        this.distributionType = Codegen.empty();
        this.processCountPerInstance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MpiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> distributionType;
        private @Nullable Output<Integer> processCountPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(MpiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.processCountPerInstance = defaults.processCountPerInstance;
        }

        public Builder distributionType(Output<String> distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }
        public Builder distributionType(String distributionType) {
            this.distributionType = Output.of(Objects.requireNonNull(distributionType));
            return this;
        }
        public Builder processCountPerInstance(@Nullable Output<Integer> processCountPerInstance) {
            this.processCountPerInstance = processCountPerInstance;
            return this;
        }
        public Builder processCountPerInstance(@Nullable Integer processCountPerInstance) {
            this.processCountPerInstance = Codegen.ofNullable(processCountPerInstance);
            return this;
        }        public MpiArgs build() {
            return new MpiArgs(distributionType, processCountPerInstance);
        }
    }
}

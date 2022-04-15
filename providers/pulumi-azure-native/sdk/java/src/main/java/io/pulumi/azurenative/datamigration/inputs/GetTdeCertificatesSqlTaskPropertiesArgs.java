// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.GetTdeCertificatesSqlTaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that gets TDE certificates in Base64 encoded format.
 * 
 */
public final class GetTdeCertificatesSqlTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GetTdeCertificatesSqlTaskPropertiesArgs Empty = new GetTdeCertificatesSqlTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<GetTdeCertificatesSqlTaskInputArgs> input;

    public Output<GetTdeCertificatesSqlTaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'GetTDECertificates.Sql'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public GetTdeCertificatesSqlTaskPropertiesArgs(
        @Nullable Output<GetTdeCertificatesSqlTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private GetTdeCertificatesSqlTaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTdeCertificatesSqlTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GetTdeCertificatesSqlTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTdeCertificatesSqlTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<GetTdeCertificatesSqlTaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable GetTdeCertificatesSqlTaskInputArgs input) {
            this.input = Codegen.ofNullable(input);
            return this;
        }
        public Builder taskType(Output<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Output.of(Objects.requireNonNull(taskType));
            return this;
        }        public GetTdeCertificatesSqlTaskPropertiesArgs build() {
            return new GetTdeCertificatesSqlTaskPropertiesArgs(input, taskType);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.finspace;

import com.pulumi.awsnative.finspace.enums.EnvironmentFederationMode;
import com.pulumi.awsnative.finspace.inputs.EnvironmentFederationParametersArgs;
import com.pulumi.awsnative.finspace.inputs.EnvironmentSuperuserParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * ARNs of FinSpace Data Bundles to install
     * 
     */
    @Import(name="dataBundles")
      private final @Nullable Output<List<String>> dataBundles;

    public Output<List<String>> dataBundles() {
        return this.dataBundles == null ? Codegen.empty() : this.dataBundles;
    }

    /**
     * Description of the Environment
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Federation mode used with the Environment
     * 
     */
    @Import(name="federationMode")
      private final @Nullable Output<EnvironmentFederationMode> federationMode;

    public Output<EnvironmentFederationMode> federationMode() {
        return this.federationMode == null ? Codegen.empty() : this.federationMode;
    }

    @Import(name="federationParameters")
      private final @Nullable Output<EnvironmentFederationParametersArgs> federationParameters;

    public Output<EnvironmentFederationParametersArgs> federationParameters() {
        return this.federationParameters == null ? Codegen.empty() : this.federationParameters;
    }

    /**
     * KMS key used to encrypt customer data within FinSpace Environment infrastructure
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Name of the Environment
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="superuserParameters")
      private final @Nullable Output<EnvironmentSuperuserParametersArgs> superuserParameters;

    public Output<EnvironmentSuperuserParametersArgs> superuserParameters() {
        return this.superuserParameters == null ? Codegen.empty() : this.superuserParameters;
    }

    public EnvironmentArgs(
        @Nullable Output<List<String>> dataBundles,
        @Nullable Output<String> description,
        @Nullable Output<EnvironmentFederationMode> federationMode,
        @Nullable Output<EnvironmentFederationParametersArgs> federationParameters,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> name,
        @Nullable Output<EnvironmentSuperuserParametersArgs> superuserParameters) {
        this.dataBundles = dataBundles;
        this.description = description;
        this.federationMode = federationMode;
        this.federationParameters = federationParameters;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.superuserParameters = superuserParameters;
    }

    private EnvironmentArgs() {
        this.dataBundles = Codegen.empty();
        this.description = Codegen.empty();
        this.federationMode = Codegen.empty();
        this.federationParameters = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.name = Codegen.empty();
        this.superuserParameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> dataBundles;
        private @Nullable Output<String> description;
        private @Nullable Output<EnvironmentFederationMode> federationMode;
        private @Nullable Output<EnvironmentFederationParametersArgs> federationParameters;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> name;
        private @Nullable Output<EnvironmentSuperuserParametersArgs> superuserParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataBundles = defaults.dataBundles;
    	      this.description = defaults.description;
    	      this.federationMode = defaults.federationMode;
    	      this.federationParameters = defaults.federationParameters;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.superuserParameters = defaults.superuserParameters;
        }

        public Builder dataBundles(@Nullable Output<List<String>> dataBundles) {
            this.dataBundles = dataBundles;
            return this;
        }
        public Builder dataBundles(@Nullable List<String> dataBundles) {
            this.dataBundles = Codegen.ofNullable(dataBundles);
            return this;
        }
        public Builder dataBundles(String... dataBundles) {
            return dataBundles(List.of(dataBundles));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder federationMode(@Nullable Output<EnvironmentFederationMode> federationMode) {
            this.federationMode = federationMode;
            return this;
        }
        public Builder federationMode(@Nullable EnvironmentFederationMode federationMode) {
            this.federationMode = Codegen.ofNullable(federationMode);
            return this;
        }
        public Builder federationParameters(@Nullable Output<EnvironmentFederationParametersArgs> federationParameters) {
            this.federationParameters = federationParameters;
            return this;
        }
        public Builder federationParameters(@Nullable EnvironmentFederationParametersArgs federationParameters) {
            this.federationParameters = Codegen.ofNullable(federationParameters);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
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
        public Builder superuserParameters(@Nullable Output<EnvironmentSuperuserParametersArgs> superuserParameters) {
            this.superuserParameters = superuserParameters;
            return this;
        }
        public Builder superuserParameters(@Nullable EnvironmentSuperuserParametersArgs superuserParameters) {
            this.superuserParameters = Codegen.ofNullable(superuserParameters);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(dataBundles, description, federationMode, federationParameters, kmsKeyId, name, superuserParameters);
        }
    }
}

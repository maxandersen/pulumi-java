// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ArtifactRuleArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.SigningKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This contains the fields corresponding to the definition of a software supply chain step in an in-toto layout. This information goes into a Grafeas note.
 * 
 */
public final class InTotoArgs extends com.pulumi.resources.ResourceArgs {

    public static final InTotoArgs Empty = new InTotoArgs();

    /**
     * This field contains the expected command used to perform the step.
     * 
     */
    @Import(name="expectedCommand")
      private final @Nullable Output<List<String>> expectedCommand;

    public Output<List<String>> expectedCommand() {
        return this.expectedCommand == null ? Codegen.empty() : this.expectedCommand;
    }

    /**
     * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the step.
     * 
     */
    @Import(name="expectedMaterials")
      private final @Nullable Output<List<ArtifactRuleArgs>> expectedMaterials;

    public Output<List<ArtifactRuleArgs>> expectedMaterials() {
        return this.expectedMaterials == null ? Codegen.empty() : this.expectedMaterials;
    }

    @Import(name="expectedProducts")
      private final @Nullable Output<List<ArtifactRuleArgs>> expectedProducts;

    public Output<List<ArtifactRuleArgs>> expectedProducts() {
        return this.expectedProducts == null ? Codegen.empty() : this.expectedProducts;
    }

    /**
     * This field contains the public keys that can be used to verify the signatures on the step metadata.
     * 
     */
    @Import(name="signingKeys")
      private final @Nullable Output<List<SigningKeyArgs>> signingKeys;

    public Output<List<SigningKeyArgs>> signingKeys() {
        return this.signingKeys == null ? Codegen.empty() : this.signingKeys;
    }

    /**
     * This field identifies the name of the step in the supply chain.
     * 
     */
    @Import(name="stepName")
      private final @Nullable Output<String> stepName;

    public Output<String> stepName() {
        return this.stepName == null ? Codegen.empty() : this.stepName;
    }

    /**
     * This field contains a value that indicates the minimum number of keys that need to be used to sign the step&#39;s in-toto link.
     * 
     */
    @Import(name="threshold")
      private final @Nullable Output<String> threshold;

    public Output<String> threshold() {
        return this.threshold == null ? Codegen.empty() : this.threshold;
    }

    public InTotoArgs(
        @Nullable Output<List<String>> expectedCommand,
        @Nullable Output<List<ArtifactRuleArgs>> expectedMaterials,
        @Nullable Output<List<ArtifactRuleArgs>> expectedProducts,
        @Nullable Output<List<SigningKeyArgs>> signingKeys,
        @Nullable Output<String> stepName,
        @Nullable Output<String> threshold) {
        this.expectedCommand = expectedCommand;
        this.expectedMaterials = expectedMaterials;
        this.expectedProducts = expectedProducts;
        this.signingKeys = signingKeys;
        this.stepName = stepName;
        this.threshold = threshold;
    }

    private InTotoArgs() {
        this.expectedCommand = Codegen.empty();
        this.expectedMaterials = Codegen.empty();
        this.expectedProducts = Codegen.empty();
        this.signingKeys = Codegen.empty();
        this.stepName = Codegen.empty();
        this.threshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> expectedCommand;
        private @Nullable Output<List<ArtifactRuleArgs>> expectedMaterials;
        private @Nullable Output<List<ArtifactRuleArgs>> expectedProducts;
        private @Nullable Output<List<SigningKeyArgs>> signingKeys;
        private @Nullable Output<String> stepName;
        private @Nullable Output<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedCommand = defaults.expectedCommand;
    	      this.expectedMaterials = defaults.expectedMaterials;
    	      this.expectedProducts = defaults.expectedProducts;
    	      this.signingKeys = defaults.signingKeys;
    	      this.stepName = defaults.stepName;
    	      this.threshold = defaults.threshold;
        }

        public Builder expectedCommand(@Nullable Output<List<String>> expectedCommand) {
            this.expectedCommand = expectedCommand;
            return this;
        }
        public Builder expectedCommand(@Nullable List<String> expectedCommand) {
            this.expectedCommand = Codegen.ofNullable(expectedCommand);
            return this;
        }
        public Builder expectedCommand(String... expectedCommand) {
            return expectedCommand(List.of(expectedCommand));
        }
        public Builder expectedMaterials(@Nullable Output<List<ArtifactRuleArgs>> expectedMaterials) {
            this.expectedMaterials = expectedMaterials;
            return this;
        }
        public Builder expectedMaterials(@Nullable List<ArtifactRuleArgs> expectedMaterials) {
            this.expectedMaterials = Codegen.ofNullable(expectedMaterials);
            return this;
        }
        public Builder expectedMaterials(ArtifactRuleArgs... expectedMaterials) {
            return expectedMaterials(List.of(expectedMaterials));
        }
        public Builder expectedProducts(@Nullable Output<List<ArtifactRuleArgs>> expectedProducts) {
            this.expectedProducts = expectedProducts;
            return this;
        }
        public Builder expectedProducts(@Nullable List<ArtifactRuleArgs> expectedProducts) {
            this.expectedProducts = Codegen.ofNullable(expectedProducts);
            return this;
        }
        public Builder expectedProducts(ArtifactRuleArgs... expectedProducts) {
            return expectedProducts(List.of(expectedProducts));
        }
        public Builder signingKeys(@Nullable Output<List<SigningKeyArgs>> signingKeys) {
            this.signingKeys = signingKeys;
            return this;
        }
        public Builder signingKeys(@Nullable List<SigningKeyArgs> signingKeys) {
            this.signingKeys = Codegen.ofNullable(signingKeys);
            return this;
        }
        public Builder signingKeys(SigningKeyArgs... signingKeys) {
            return signingKeys(List.of(signingKeys));
        }
        public Builder stepName(@Nullable Output<String> stepName) {
            this.stepName = stepName;
            return this;
        }
        public Builder stepName(@Nullable String stepName) {
            this.stepName = Codegen.ofNullable(stepName);
            return this;
        }
        public Builder threshold(@Nullable Output<String> threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder threshold(@Nullable String threshold) {
            this.threshold = Codegen.ofNullable(threshold);
            return this;
        }        public InTotoArgs build() {
            return new InTotoArgs(expectedCommand, expectedMaterials, expectedProducts, signingKeys, stepName, threshold);
        }
    }
}

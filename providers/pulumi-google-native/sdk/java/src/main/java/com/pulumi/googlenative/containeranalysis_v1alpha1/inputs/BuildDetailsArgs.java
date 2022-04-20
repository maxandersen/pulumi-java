// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildProvenanceArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InTotoStatementArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message encapsulating build provenance details.
 * 
 */
public final class BuildDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildDetailsArgs Empty = new BuildDetailsArgs();

    /**
     * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    @Import(name="intotoStatement")
      private final @Nullable Output<InTotoStatementArgs> intotoStatement;

    public Output<InTotoStatementArgs> intotoStatement() {
        return this.intotoStatement == null ? Codegen.empty() : this.intotoStatement;
    }

    /**
     * The actual provenance
     * 
     */
    @Import(name="provenance")
      private final @Nullable Output<BuildProvenanceArgs> provenance;

    public Output<BuildProvenanceArgs> provenance() {
        return this.provenance == null ? Codegen.empty() : this.provenance;
    }

    /**
     * Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    @Import(name="provenanceBytes")
      private final @Nullable Output<String> provenanceBytes;

    public Output<String> provenanceBytes() {
        return this.provenanceBytes == null ? Codegen.empty() : this.provenanceBytes;
    }

    public BuildDetailsArgs(
        @Nullable Output<InTotoStatementArgs> intotoStatement,
        @Nullable Output<BuildProvenanceArgs> provenance,
        @Nullable Output<String> provenanceBytes) {
        this.intotoStatement = intotoStatement;
        this.provenance = provenance;
        this.provenanceBytes = provenanceBytes;
    }

    private BuildDetailsArgs() {
        this.intotoStatement = Codegen.empty();
        this.provenance = Codegen.empty();
        this.provenanceBytes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InTotoStatementArgs> intotoStatement;
        private @Nullable Output<BuildProvenanceArgs> provenance;
        private @Nullable Output<String> provenanceBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intotoStatement = defaults.intotoStatement;
    	      this.provenance = defaults.provenance;
    	      this.provenanceBytes = defaults.provenanceBytes;
        }

        public Builder intotoStatement(@Nullable Output<InTotoStatementArgs> intotoStatement) {
            this.intotoStatement = intotoStatement;
            return this;
        }
        public Builder intotoStatement(@Nullable InTotoStatementArgs intotoStatement) {
            this.intotoStatement = Codegen.ofNullable(intotoStatement);
            return this;
        }
        public Builder provenance(@Nullable Output<BuildProvenanceArgs> provenance) {
            this.provenance = provenance;
            return this;
        }
        public Builder provenance(@Nullable BuildProvenanceArgs provenance) {
            this.provenance = Codegen.ofNullable(provenance);
            return this;
        }
        public Builder provenanceBytes(@Nullable Output<String> provenanceBytes) {
            this.provenanceBytes = provenanceBytes;
            return this;
        }
        public Builder provenanceBytes(@Nullable String provenanceBytes) {
            this.provenanceBytes = Codegen.ofNullable(provenanceBytes);
            return this;
        }        public BuildDetailsArgs build() {
            return new BuildDetailsArgs(intotoStatement, provenance, provenanceBytes);
        }
    }
}

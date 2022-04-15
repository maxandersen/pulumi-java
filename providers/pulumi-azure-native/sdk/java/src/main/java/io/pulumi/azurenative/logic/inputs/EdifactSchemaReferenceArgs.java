// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Edifact schema reference.
 * 
 */
public final class EdifactSchemaReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactSchemaReferenceArgs Empty = new EdifactSchemaReferenceArgs();

    /**
     * The association assigned code.
     * 
     */
    @Import(name="associationAssignedCode")
      private final @Nullable Output<String> associationAssignedCode;

    public Output<String> associationAssignedCode() {
        return this.associationAssignedCode == null ? Codegen.empty() : this.associationAssignedCode;
    }

    /**
     * The message id.
     * 
     */
    @Import(name="messageId", required=true)
      private final Output<String> messageId;

    public Output<String> messageId() {
        return this.messageId;
    }

    /**
     * The message release version.
     * 
     */
    @Import(name="messageRelease", required=true)
      private final Output<String> messageRelease;

    public Output<String> messageRelease() {
        return this.messageRelease;
    }

    /**
     * The message version.
     * 
     */
    @Import(name="messageVersion", required=true)
      private final Output<String> messageVersion;

    public Output<String> messageVersion() {
        return this.messageVersion;
    }

    /**
     * The schema name.
     * 
     */
    @Import(name="schemaName", required=true)
      private final Output<String> schemaName;

    public Output<String> schemaName() {
        return this.schemaName;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId")
      private final @Nullable Output<String> senderApplicationId;

    public Output<String> senderApplicationId() {
        return this.senderApplicationId == null ? Codegen.empty() : this.senderApplicationId;
    }

    /**
     * The sender application qualifier.
     * 
     */
    @Import(name="senderApplicationQualifier")
      private final @Nullable Output<String> senderApplicationQualifier;

    public Output<String> senderApplicationQualifier() {
        return this.senderApplicationQualifier == null ? Codegen.empty() : this.senderApplicationQualifier;
    }

    public EdifactSchemaReferenceArgs(
        @Nullable Output<String> associationAssignedCode,
        Output<String> messageId,
        Output<String> messageRelease,
        Output<String> messageVersion,
        Output<String> schemaName,
        @Nullable Output<String> senderApplicationId,
        @Nullable Output<String> senderApplicationQualifier) {
        this.associationAssignedCode = associationAssignedCode;
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.messageRelease = Objects.requireNonNull(messageRelease, "expected parameter 'messageRelease' to be non-null");
        this.messageVersion = Objects.requireNonNull(messageVersion, "expected parameter 'messageVersion' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.senderApplicationId = senderApplicationId;
        this.senderApplicationQualifier = senderApplicationQualifier;
    }

    private EdifactSchemaReferenceArgs() {
        this.associationAssignedCode = Codegen.empty();
        this.messageId = Codegen.empty();
        this.messageRelease = Codegen.empty();
        this.messageVersion = Codegen.empty();
        this.schemaName = Codegen.empty();
        this.senderApplicationId = Codegen.empty();
        this.senderApplicationQualifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactSchemaReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> associationAssignedCode;
        private Output<String> messageId;
        private Output<String> messageRelease;
        private Output<String> messageVersion;
        private Output<String> schemaName;
        private @Nullable Output<String> senderApplicationId;
        private @Nullable Output<String> senderApplicationQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactSchemaReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationAssignedCode = defaults.associationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.schemaName = defaults.schemaName;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.senderApplicationQualifier = defaults.senderApplicationQualifier;
        }

        public Builder associationAssignedCode(@Nullable Output<String> associationAssignedCode) {
            this.associationAssignedCode = associationAssignedCode;
            return this;
        }
        public Builder associationAssignedCode(@Nullable String associationAssignedCode) {
            this.associationAssignedCode = Codegen.ofNullable(associationAssignedCode);
            return this;
        }
        public Builder messageId(Output<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }
        public Builder messageId(String messageId) {
            this.messageId = Output.of(Objects.requireNonNull(messageId));
            return this;
        }
        public Builder messageRelease(Output<String> messageRelease) {
            this.messageRelease = Objects.requireNonNull(messageRelease);
            return this;
        }
        public Builder messageRelease(String messageRelease) {
            this.messageRelease = Output.of(Objects.requireNonNull(messageRelease));
            return this;
        }
        public Builder messageVersion(Output<String> messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }
        public Builder messageVersion(String messageVersion) {
            this.messageVersion = Output.of(Objects.requireNonNull(messageVersion));
            return this;
        }
        public Builder schemaName(Output<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Output.of(Objects.requireNonNull(schemaName));
            return this;
        }
        public Builder senderApplicationId(@Nullable Output<String> senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }
        public Builder senderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = Codegen.ofNullable(senderApplicationId);
            return this;
        }
        public Builder senderApplicationQualifier(@Nullable Output<String> senderApplicationQualifier) {
            this.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }
        public Builder senderApplicationQualifier(@Nullable String senderApplicationQualifier) {
            this.senderApplicationQualifier = Codegen.ofNullable(senderApplicationQualifier);
            return this;
        }        public EdifactSchemaReferenceArgs build() {
            return new EdifactSchemaReferenceArgs(associationAssignedCode, messageId, messageRelease, messageVersion, schemaName, senderApplicationId, senderApplicationQualifier);
        }
    }
}

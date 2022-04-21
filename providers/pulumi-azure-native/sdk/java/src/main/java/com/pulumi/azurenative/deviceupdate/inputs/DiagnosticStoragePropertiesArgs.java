// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.azurenative.deviceupdate.enums.AuthenticationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer-initiated diagnostic log collection storage properties
 * 
 */
public final class DiagnosticStoragePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticStoragePropertiesArgs Empty = new DiagnosticStoragePropertiesArgs();

    /**
     * Authentication Type
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,AuthenticationType>> authenticationType;

    public Output<Either<String,AuthenticationType>> authenticationType() {
        return this.authenticationType;
    }

    /**
     * ConnectionString of the diagnostic storage account
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * ResourceId of the diagnostic storage account
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    private DiagnosticStoragePropertiesArgs() {}

    private DiagnosticStoragePropertiesArgs(DiagnosticStoragePropertiesArgs $) {
        this.authenticationType = $.authenticationType;
        this.connectionString = $.connectionString;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticStoragePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticStoragePropertiesArgs $;

        public Builder() {
            $ = new DiagnosticStoragePropertiesArgs();
        }

        public Builder(DiagnosticStoragePropertiesArgs defaults) {
            $ = new DiagnosticStoragePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationType(Output<Either<String,AuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(Either<String,AuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public DiagnosticStoragePropertiesArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatabaseEncryptionConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseEncryptionConfigGetArgs Empty = new DatabaseEncryptionConfigGetArgs();

    /**
     * Fully qualified name of the KMS key to use to encrypt this database. This key must exist
     * in the same location as the Spanner Database.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    private DatabaseEncryptionConfigGetArgs() {}

    private DatabaseEncryptionConfigGetArgs(DatabaseEncryptionConfigGetArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseEncryptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseEncryptionConfigGetArgs $;

        public Builder() {
            $ = new DatabaseEncryptionConfigGetArgs();
        }

        public Builder(DatabaseEncryptionConfigGetArgs defaults) {
            $ = new DatabaseEncryptionConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public DatabaseEncryptionConfigGetArgs build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest extends com.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest Empty = new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest();

    /**
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * 
     */
    @Import(name="catalogEncryptionMode", required=true)
    private String catalogEncryptionMode;

    public String catalogEncryptionMode() {
        return this.catalogEncryptionMode;
    }

    /**
     * The ARN of the AWS KMS key to use for encryption at rest.
     * 
     */
    @Import(name="sseAwsKmsKeyId", required=true)
    private String sseAwsKmsKeyId;

    public String sseAwsKmsKeyId() {
        return this.sseAwsKmsKeyId;
    }

    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest() {}

    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest $) {
        this.catalogEncryptionMode = $.catalogEncryptionMode;
        this.sseAwsKmsKeyId = $.sseAwsKmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest $;

        public Builder() {
            $ = new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest();
        }

        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest defaults) {
            $ = new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest(Objects.requireNonNull(defaults));
        }

        public Builder catalogEncryptionMode(String catalogEncryptionMode) {
            $.catalogEncryptionMode = catalogEncryptionMode;
            return this;
        }

        public Builder sseAwsKmsKeyId(String sseAwsKmsKeyId) {
            $.sseAwsKmsKeyId = sseAwsKmsKeyId;
            return this;
        }

        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest build() {
            $.catalogEncryptionMode = Objects.requireNonNull($.catalogEncryptionMode, "expected parameter 'catalogEncryptionMode' to be non-null");
            $.sseAwsKmsKeyId = Objects.requireNonNull($.sseAwsKmsKeyId, "expected parameter 'sseAwsKmsKeyId' to be non-null");
            return $;
        }
    }

}

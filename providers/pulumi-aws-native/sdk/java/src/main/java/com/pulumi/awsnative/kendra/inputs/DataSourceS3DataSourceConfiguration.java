// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceAccessControlListConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceDocumentsMetadataConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * S3 data source configuration
 * 
 */
public final class DataSourceS3DataSourceConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceS3DataSourceConfiguration Empty = new DataSourceS3DataSourceConfiguration();

    @Import(name="accessControlListConfiguration")
    private @Nullable DataSourceAccessControlListConfiguration accessControlListConfiguration;

    public Optional<DataSourceAccessControlListConfiguration> accessControlListConfiguration() {
        return Optional.ofNullable(this.accessControlListConfiguration);
    }

    @Import(name="bucketName", required=true)
    private String bucketName;

    public String bucketName() {
        return this.bucketName;
    }

    @Import(name="documentsMetadataConfiguration")
    private @Nullable DataSourceDocumentsMetadataConfiguration documentsMetadataConfiguration;

    public Optional<DataSourceDocumentsMetadataConfiguration> documentsMetadataConfiguration() {
        return Optional.ofNullable(this.documentsMetadataConfiguration);
    }

    @Import(name="exclusionPatterns")
    private @Nullable List<String> exclusionPatterns;

    public Optional<List<String>> exclusionPatterns() {
        return Optional.ofNullable(this.exclusionPatterns);
    }

    @Import(name="inclusionPatterns")
    private @Nullable List<String> inclusionPatterns;

    public Optional<List<String>> inclusionPatterns() {
        return Optional.ofNullable(this.inclusionPatterns);
    }

    @Import(name="inclusionPrefixes")
    private @Nullable List<String> inclusionPrefixes;

    public Optional<List<String>> inclusionPrefixes() {
        return Optional.ofNullable(this.inclusionPrefixes);
    }

    private DataSourceS3DataSourceConfiguration() {}

    private DataSourceS3DataSourceConfiguration(DataSourceS3DataSourceConfiguration $) {
        this.accessControlListConfiguration = $.accessControlListConfiguration;
        this.bucketName = $.bucketName;
        this.documentsMetadataConfiguration = $.documentsMetadataConfiguration;
        this.exclusionPatterns = $.exclusionPatterns;
        this.inclusionPatterns = $.inclusionPatterns;
        this.inclusionPrefixes = $.inclusionPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceS3DataSourceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceS3DataSourceConfiguration $;

        public Builder() {
            $ = new DataSourceS3DataSourceConfiguration();
        }

        public Builder(DataSourceS3DataSourceConfiguration defaults) {
            $ = new DataSourceS3DataSourceConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder accessControlListConfiguration(@Nullable DataSourceAccessControlListConfiguration accessControlListConfiguration) {
            $.accessControlListConfiguration = accessControlListConfiguration;
            return this;
        }

        public Builder bucketName(String bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder documentsMetadataConfiguration(@Nullable DataSourceDocumentsMetadataConfiguration documentsMetadataConfiguration) {
            $.documentsMetadataConfiguration = documentsMetadataConfiguration;
            return this;
        }

        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            $.exclusionPatterns = exclusionPatterns;
            return this;
        }

        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }

        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            $.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }

        public Builder inclusionPrefixes(@Nullable List<String> inclusionPrefixes) {
            $.inclusionPrefixes = inclusionPrefixes;
            return this;
        }

        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }

        public DataSourceS3DataSourceConfiguration build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}

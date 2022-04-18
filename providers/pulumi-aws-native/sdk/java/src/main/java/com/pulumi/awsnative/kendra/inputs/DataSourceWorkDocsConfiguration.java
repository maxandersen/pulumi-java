// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWorkDocsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceWorkDocsConfiguration Empty = new DataSourceWorkDocsConfiguration();

    @Import(name="crawlComments")
      private final @Nullable Boolean crawlComments;

    public Optional<Boolean> crawlComments() {
        return this.crawlComments == null ? Optional.empty() : Optional.ofNullable(this.crawlComments);
    }

    @Import(name="exclusionPatterns")
      private final @Nullable List<String> exclusionPatterns;

    public List<String> exclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }

    @Import(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    @Import(name="inclusionPatterns")
      private final @Nullable List<String> inclusionPatterns;

    public List<String> inclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="useChangeLog")
      private final @Nullable Boolean useChangeLog;

    public Optional<Boolean> useChangeLog() {
        return this.useChangeLog == null ? Optional.empty() : Optional.ofNullable(this.useChangeLog);
    }

    public DataSourceWorkDocsConfiguration(
        @Nullable Boolean crawlComments,
        @Nullable List<String> exclusionPatterns,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable List<String> inclusionPatterns,
        String organizationId,
        @Nullable Boolean useChangeLog) {
        this.crawlComments = crawlComments;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.useChangeLog = useChangeLog;
    }

    private DataSourceWorkDocsConfiguration() {
        this.crawlComments = null;
        this.exclusionPatterns = List.of();
        this.fieldMappings = List.of();
        this.inclusionPatterns = List.of();
        this.organizationId = null;
        this.useChangeLog = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWorkDocsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlComments;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private String organizationId;
        private @Nullable Boolean useChangeLog;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWorkDocsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlComments = defaults.crawlComments;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.organizationId = defaults.organizationId;
    	      this.useChangeLog = defaults.useChangeLog;
        }

        public Builder crawlComments(@Nullable Boolean crawlComments) {
            this.crawlComments = crawlComments;
            return this;
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder useChangeLog(@Nullable Boolean useChangeLog) {
            this.useChangeLog = useChangeLog;
            return this;
        }        public DataSourceWorkDocsConfiguration build() {
            return new DataSourceWorkDocsConfiguration(crawlComments, exclusionPatterns, fieldMappings, inclusionPatterns, organizationId, useChangeLog);
        }
    }
}

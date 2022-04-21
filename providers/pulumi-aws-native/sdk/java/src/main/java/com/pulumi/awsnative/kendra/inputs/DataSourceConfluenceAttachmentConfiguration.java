// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceConfluenceAttachmentToIndexFieldMapping;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceAttachmentConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluenceAttachmentConfiguration Empty = new DataSourceConfluenceAttachmentConfiguration();

    @Import(name="attachmentFieldMappings")
    private @Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings;

    public Optional<List<DataSourceConfluenceAttachmentToIndexFieldMapping>> attachmentFieldMappings() {
        return Optional.ofNullable(this.attachmentFieldMappings);
    }

    @Import(name="crawlAttachments")
    private @Nullable Boolean crawlAttachments;

    public Optional<Boolean> crawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }

    private DataSourceConfluenceAttachmentConfiguration() {}

    private DataSourceConfluenceAttachmentConfiguration(DataSourceConfluenceAttachmentConfiguration $) {
        this.attachmentFieldMappings = $.attachmentFieldMappings;
        this.crawlAttachments = $.crawlAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfluenceAttachmentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluenceAttachmentConfiguration $;

        public Builder() {
            $ = new DataSourceConfluenceAttachmentConfiguration();
        }

        public Builder(DataSourceConfluenceAttachmentConfiguration defaults) {
            $ = new DataSourceConfluenceAttachmentConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder attachmentFieldMappings(@Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings) {
            $.attachmentFieldMappings = attachmentFieldMappings;
            return this;
        }

        public Builder attachmentFieldMappings(DataSourceConfluenceAttachmentToIndexFieldMapping... attachmentFieldMappings) {
            return attachmentFieldMappings(List.of(attachmentFieldMappings));
        }

        public Builder crawlAttachments(@Nullable Boolean crawlAttachments) {
            $.crawlAttachments = crawlAttachments;
            return this;
        }

        public DataSourceConfluenceAttachmentConfiguration build() {
            return $;
        }
    }

}

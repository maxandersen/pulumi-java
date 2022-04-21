// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorCsvFormatDescriptorFileCompression;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorCsvFormatDescriptor extends com.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorCsvFormatDescriptor Empty = new AnomalyDetectorCsvFormatDescriptor();

    @Import(name="charset")
    private @Nullable String charset;

    public Optional<String> charset() {
        return Optional.ofNullable(this.charset);
    }

    @Import(name="containsHeader")
    private @Nullable Boolean containsHeader;

    public Optional<Boolean> containsHeader() {
        return Optional.ofNullable(this.containsHeader);
    }

    @Import(name="delimiter")
    private @Nullable String delimiter;

    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    @Import(name="fileCompression")
    private @Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression;

    public Optional<AnomalyDetectorCsvFormatDescriptorFileCompression> fileCompression() {
        return Optional.ofNullable(this.fileCompression);
    }

    @Import(name="headerList")
    private @Nullable List<String> headerList;

    public Optional<List<String>> headerList() {
        return Optional.ofNullable(this.headerList);
    }

    @Import(name="quoteSymbol")
    private @Nullable String quoteSymbol;

    public Optional<String> quoteSymbol() {
        return Optional.ofNullable(this.quoteSymbol);
    }

    private AnomalyDetectorCsvFormatDescriptor() {}

    private AnomalyDetectorCsvFormatDescriptor(AnomalyDetectorCsvFormatDescriptor $) {
        this.charset = $.charset;
        this.containsHeader = $.containsHeader;
        this.delimiter = $.delimiter;
        this.fileCompression = $.fileCompression;
        this.headerList = $.headerList;
        this.quoteSymbol = $.quoteSymbol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorCsvFormatDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorCsvFormatDescriptor $;

        public Builder() {
            $ = new AnomalyDetectorCsvFormatDescriptor();
        }

        public Builder(AnomalyDetectorCsvFormatDescriptor defaults) {
            $ = new AnomalyDetectorCsvFormatDescriptor(Objects.requireNonNull(defaults));
        }

        public Builder charset(@Nullable String charset) {
            $.charset = charset;
            return this;
        }

        public Builder containsHeader(@Nullable Boolean containsHeader) {
            $.containsHeader = containsHeader;
            return this;
        }

        public Builder delimiter(@Nullable String delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        public Builder fileCompression(@Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression) {
            $.fileCompression = fileCompression;
            return this;
        }

        public Builder headerList(@Nullable List<String> headerList) {
            $.headerList = headerList;
            return this;
        }

        public Builder headerList(String... headerList) {
            return headerList(List.of(headerList));
        }

        public Builder quoteSymbol(@Nullable String quoteSymbol) {
            $.quoteSymbol = quoteSymbol;
            return this;
        }

        public AnomalyDetectorCsvFormatDescriptor build() {
            return $;
        }
    }

}

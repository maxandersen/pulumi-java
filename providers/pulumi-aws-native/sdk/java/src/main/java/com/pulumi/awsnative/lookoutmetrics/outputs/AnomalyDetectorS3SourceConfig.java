// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.outputs;

import com.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorFileFormatDescriptor;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AnomalyDetectorS3SourceConfig {
    private final AnomalyDetectorFileFormatDescriptor fileFormatDescriptor;
    private final @Nullable List<String> historicalDataPathList;
    private final String roleArn;
    private final @Nullable List<String> templatedPathList;

    @CustomType.Constructor
    private AnomalyDetectorS3SourceConfig(
        @CustomType.Parameter("fileFormatDescriptor") AnomalyDetectorFileFormatDescriptor fileFormatDescriptor,
        @CustomType.Parameter("historicalDataPathList") @Nullable List<String> historicalDataPathList,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("templatedPathList") @Nullable List<String> templatedPathList) {
        this.fileFormatDescriptor = fileFormatDescriptor;
        this.historicalDataPathList = historicalDataPathList;
        this.roleArn = roleArn;
        this.templatedPathList = templatedPathList;
    }

    public AnomalyDetectorFileFormatDescriptor fileFormatDescriptor() {
        return this.fileFormatDescriptor;
    }
    public List<String> historicalDataPathList() {
        return this.historicalDataPathList == null ? List.of() : this.historicalDataPathList;
    }
    public String roleArn() {
        return this.roleArn;
    }
    public List<String> templatedPathList() {
        return this.templatedPathList == null ? List.of() : this.templatedPathList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorS3SourceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorFileFormatDescriptor fileFormatDescriptor;
        private @Nullable List<String> historicalDataPathList;
        private String roleArn;
        private @Nullable List<String> templatedPathList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorS3SourceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileFormatDescriptor = defaults.fileFormatDescriptor;
    	      this.historicalDataPathList = defaults.historicalDataPathList;
    	      this.roleArn = defaults.roleArn;
    	      this.templatedPathList = defaults.templatedPathList;
        }

        public Builder fileFormatDescriptor(AnomalyDetectorFileFormatDescriptor fileFormatDescriptor) {
            this.fileFormatDescriptor = Objects.requireNonNull(fileFormatDescriptor);
            return this;
        }
        public Builder historicalDataPathList(@Nullable List<String> historicalDataPathList) {
            this.historicalDataPathList = historicalDataPathList;
            return this;
        }
        public Builder historicalDataPathList(String... historicalDataPathList) {
            return historicalDataPathList(List.of(historicalDataPathList));
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder templatedPathList(@Nullable List<String> templatedPathList) {
            this.templatedPathList = templatedPathList;
            return this;
        }
        public Builder templatedPathList(String... templatedPathList) {
            return templatedPathList(List.of(templatedPathList));
        }        public AnomalyDetectorS3SourceConfig build() {
            return new AnomalyDetectorS3SourceConfig(fileFormatDescriptor, historicalDataPathList, roleArn, templatedPathList);
        }
    }
}

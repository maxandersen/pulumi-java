// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2TableOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2HybridOptionsResponse {
    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    private final String description;
    /**
     * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
     * 
     */
    private final Map<String,String> labels;
    /**
     * These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    private final List<String> requiredFindingLabelKeys;
    /**
     * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    private final GooglePrivacyDlpV2TableOptionsResponse tableOptions;

    @CustomType.Constructor
    private GooglePrivacyDlpV2HybridOptionsResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("requiredFindingLabelKeys") List<String> requiredFindingLabelKeys,
        @CustomType.Parameter("tableOptions") GooglePrivacyDlpV2TableOptionsResponse tableOptions) {
        this.description = description;
        this.labels = labels;
        this.requiredFindingLabelKeys = requiredFindingLabelKeys;
        this.tableOptions = tableOptions;
    }

    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
    */
    public List<String> requiredFindingLabelKeys() {
        return this.requiredFindingLabelKeys;
    }
    /**
     * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
    */
    public GooglePrivacyDlpV2TableOptionsResponse tableOptions() {
        return this.tableOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2HybridOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Map<String,String> labels;
        private List<String> requiredFindingLabelKeys;
        private GooglePrivacyDlpV2TableOptionsResponse tableOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2HybridOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.requiredFindingLabelKeys = defaults.requiredFindingLabelKeys;
    	      this.tableOptions = defaults.tableOptions;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder requiredFindingLabelKeys(List<String> requiredFindingLabelKeys) {
            this.requiredFindingLabelKeys = Objects.requireNonNull(requiredFindingLabelKeys);
            return this;
        }
        public Builder requiredFindingLabelKeys(String... requiredFindingLabelKeys) {
            return requiredFindingLabelKeys(List.of(requiredFindingLabelKeys));
        }
        public Builder tableOptions(GooglePrivacyDlpV2TableOptionsResponse tableOptions) {
            this.tableOptions = Objects.requireNonNull(tableOptions);
            return this;
        }        public GooglePrivacyDlpV2HybridOptionsResponse build() {
            return new GooglePrivacyDlpV2HybridOptionsResponse(description, labels, requiredFindingLabelKeys, tableOptions);
        }
    }
}

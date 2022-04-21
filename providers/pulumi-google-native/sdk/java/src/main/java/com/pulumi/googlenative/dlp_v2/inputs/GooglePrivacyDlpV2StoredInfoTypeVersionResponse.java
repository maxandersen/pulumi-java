// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ErrorResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StoredInfoTypeConfigResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StoredInfoTypeStatsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Version of a StoredInfoType, including the configuration used to build it, create timestamp, and current state.
 * 
 */
public final class GooglePrivacyDlpV2StoredInfoTypeVersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2StoredInfoTypeVersionResponse Empty = new GooglePrivacyDlpV2StoredInfoTypeVersionResponse();

    /**
     * StoredInfoType configuration.
     * 
     */
    @Import(name="config", required=true)
    private GooglePrivacyDlpV2StoredInfoTypeConfigResponse config;

    public GooglePrivacyDlpV2StoredInfoTypeConfigResponse config() {
        return this.config;
    }

    /**
     * Create timestamp of the version. Read-only, determined by the system when the version is created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Errors that occurred when creating this storedInfoType version, or anomalies detected in the storedInfoType data that render it unusable. Only the five most recent errors will be displayed, with the most recent error appearing first. For example, some of the data for stored custom dictionaries is put in the user&#39;s Google Cloud Storage bucket, and if this data is modified or deleted by the user or another system, the dictionary becomes invalid. If any errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType API method to create another version of the storedInfoType to continue using it, reusing the same `config` if it was not the source of the error.
     * 
     */
    @Import(name="errors", required=true)
    private List<GooglePrivacyDlpV2ErrorResponse> errors;

    public List<GooglePrivacyDlpV2ErrorResponse> errors() {
        return this.errors;
    }

    /**
     * Stored info type version state. Read-only, updated by the system during dictionary creation.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    /**
     * Statistics about this storedInfoType version.
     * 
     */
    @Import(name="stats", required=true)
    private GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats;

    public GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats() {
        return this.stats;
    }

    private GooglePrivacyDlpV2StoredInfoTypeVersionResponse() {}

    private GooglePrivacyDlpV2StoredInfoTypeVersionResponse(GooglePrivacyDlpV2StoredInfoTypeVersionResponse $) {
        this.config = $.config;
        this.createTime = $.createTime;
        this.errors = $.errors;
        this.state = $.state;
        this.stats = $.stats;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2StoredInfoTypeVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2StoredInfoTypeVersionResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2StoredInfoTypeVersionResponse();
        }

        public Builder(GooglePrivacyDlpV2StoredInfoTypeVersionResponse defaults) {
            $ = new GooglePrivacyDlpV2StoredInfoTypeVersionResponse(Objects.requireNonNull(defaults));
        }

        public Builder config(GooglePrivacyDlpV2StoredInfoTypeConfigResponse config) {
            $.config = config;
            return this;
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder errors(List<GooglePrivacyDlpV2ErrorResponse> errors) {
            $.errors = errors;
            return this;
        }

        public Builder errors(GooglePrivacyDlpV2ErrorResponse... errors) {
            return errors(List.of(errors));
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public Builder stats(GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats) {
            $.stats = stats;
            return this;
        }

        public GooglePrivacyDlpV2StoredInfoTypeVersionResponse build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.errors = Objects.requireNonNull($.errors, "expected parameter 'errors' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.stats = Objects.requireNonNull($.stats, "expected parameter 'stats' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Options for job processing.
 * 
 */
public final class ProcessingOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProcessingOptionsResponse Empty = new ProcessingOptionsResponse();

    /**
     * If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    @Import(name="disableStreetAddressResolution", required=true)
    private Boolean disableStreetAddressResolution;

    public Boolean disableStreetAddressResolution() {
        return this.disableStreetAddressResolution;
    }

    /**
     * Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation isn&#39;t disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    @Import(name="htmlSanitization", required=true)
    private String htmlSanitization;

    public String htmlSanitization() {
        return this.htmlSanitization;
    }

    private ProcessingOptionsResponse() {}

    private ProcessingOptionsResponse(ProcessingOptionsResponse $) {
        this.disableStreetAddressResolution = $.disableStreetAddressResolution;
        this.htmlSanitization = $.htmlSanitization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcessingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcessingOptionsResponse $;

        public Builder() {
            $ = new ProcessingOptionsResponse();
        }

        public Builder(ProcessingOptionsResponse defaults) {
            $ = new ProcessingOptionsResponse(Objects.requireNonNull(defaults));
        }

        public Builder disableStreetAddressResolution(Boolean disableStreetAddressResolution) {
            $.disableStreetAddressResolution = disableStreetAddressResolution;
            return this;
        }

        public Builder htmlSanitization(String htmlSanitization) {
            $.htmlSanitization = htmlSanitization;
            return this;
        }

        public ProcessingOptionsResponse build() {
            $.disableStreetAddressResolution = Objects.requireNonNull($.disableStreetAddressResolution, "expected parameter 'disableStreetAddressResolution' to be non-null");
            $.htmlSanitization = Objects.requireNonNull($.htmlSanitization, "expected parameter 'htmlSanitization' to be non-null");
            return $;
        }
    }

}

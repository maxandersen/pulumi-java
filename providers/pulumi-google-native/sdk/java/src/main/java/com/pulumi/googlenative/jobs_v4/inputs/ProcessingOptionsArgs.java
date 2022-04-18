// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.jobs_v4.enums.ProcessingOptionsHtmlSanitization;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options for job processing.
 * 
 */
public final class ProcessingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcessingOptionsArgs Empty = new ProcessingOptionsArgs();

    /**
     * If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    @Import(name="disableStreetAddressResolution")
      private final @Nullable Output<Boolean> disableStreetAddressResolution;

    public Output<Boolean> disableStreetAddressResolution() {
        return this.disableStreetAddressResolution == null ? Codegen.empty() : this.disableStreetAddressResolution;
    }

    /**
     * Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation isn't disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    @Import(name="htmlSanitization")
      private final @Nullable Output<ProcessingOptionsHtmlSanitization> htmlSanitization;

    public Output<ProcessingOptionsHtmlSanitization> htmlSanitization() {
        return this.htmlSanitization == null ? Codegen.empty() : this.htmlSanitization;
    }

    public ProcessingOptionsArgs(
        @Nullable Output<Boolean> disableStreetAddressResolution,
        @Nullable Output<ProcessingOptionsHtmlSanitization> htmlSanitization) {
        this.disableStreetAddressResolution = disableStreetAddressResolution;
        this.htmlSanitization = htmlSanitization;
    }

    private ProcessingOptionsArgs() {
        this.disableStreetAddressResolution = Codegen.empty();
        this.htmlSanitization = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableStreetAddressResolution;
        private @Nullable Output<ProcessingOptionsHtmlSanitization> htmlSanitization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableStreetAddressResolution = defaults.disableStreetAddressResolution;
    	      this.htmlSanitization = defaults.htmlSanitization;
        }

        public Builder disableStreetAddressResolution(@Nullable Output<Boolean> disableStreetAddressResolution) {
            this.disableStreetAddressResolution = disableStreetAddressResolution;
            return this;
        }
        public Builder disableStreetAddressResolution(@Nullable Boolean disableStreetAddressResolution) {
            this.disableStreetAddressResolution = Codegen.ofNullable(disableStreetAddressResolution);
            return this;
        }
        public Builder htmlSanitization(@Nullable Output<ProcessingOptionsHtmlSanitization> htmlSanitization) {
            this.htmlSanitization = htmlSanitization;
            return this;
        }
        public Builder htmlSanitization(@Nullable ProcessingOptionsHtmlSanitization htmlSanitization) {
            this.htmlSanitization = Codegen.ofNullable(htmlSanitization);
            return this;
        }        public ProcessingOptionsArgs build() {
            return new ProcessingOptionsArgs(disableStreetAddressResolution, htmlSanitization);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single Apt package repository. This repository is added to a repo file that is stored at `/etc/apt/sources.list.d/google_osconfig.list`.
 * 
 */
public final class AptRepositoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final AptRepositoryResponse Empty = new AptRepositoryResponse();

    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * 
     */
    @Import(name="archiveType", required=true)
    private String archiveType;

    public String archiveType() {
        return this.archiveType;
    }

    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    @Import(name="components", required=true)
    private List<String> components;

    public List<String> components() {
        return this.components;
    }

    /**
     * Distribution of this repository.
     * 
     */
    @Import(name="distribution", required=true)
    private String distribution;

    public String distribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg` containing all the keys in any applied guest policy.
     * 
     */
    @Import(name="gpgKey", required=true)
    private String gpgKey;

    public String gpgKey() {
        return this.gpgKey;
    }

    /**
     * URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    private AptRepositoryResponse() {}

    private AptRepositoryResponse(AptRepositoryResponse $) {
        this.archiveType = $.archiveType;
        this.components = $.components;
        this.distribution = $.distribution;
        this.gpgKey = $.gpgKey;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AptRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AptRepositoryResponse $;

        public Builder() {
            $ = new AptRepositoryResponse();
        }

        public Builder(AptRepositoryResponse defaults) {
            $ = new AptRepositoryResponse(Objects.requireNonNull(defaults));
        }

        public Builder archiveType(String archiveType) {
            $.archiveType = archiveType;
            return this;
        }

        public Builder components(List<String> components) {
            $.components = components;
            return this;
        }

        public Builder components(String... components) {
            return components(List.of(components));
        }

        public Builder distribution(String distribution) {
            $.distribution = distribution;
            return this;
        }

        public Builder gpgKey(String gpgKey) {
            $.gpgKey = gpgKey;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public AptRepositoryResponse build() {
            $.archiveType = Objects.requireNonNull($.archiveType, "expected parameter 'archiveType' to be non-null");
            $.components = Objects.requireNonNull($.components, "expected parameter 'components' to be non-null");
            $.distribution = Objects.requireNonNull($.distribution, "expected parameter 'distribution' to be non-null");
            $.gpgKey = Objects.requireNonNull($.gpgKey, "expected parameter 'gpgKey' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}

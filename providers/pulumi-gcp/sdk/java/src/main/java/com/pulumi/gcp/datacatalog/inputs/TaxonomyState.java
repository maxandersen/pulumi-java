// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaxonomyState extends com.pulumi.resources.ResourceArgs {

    public static final TaxonomyState Empty = new TaxonomyState();

    /**
     * A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    @Import(name="activatedPolicyTypes")
    private @Nullable Output<List<String>> activatedPolicyTypes;

    public Optional<Output<List<String>>> activatedPolicyTypes() {
        return Optional.ofNullable(this.activatedPolicyTypes);
    }

    /**
     * Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Resource name of this taxonomy, whose format is: &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Taxonomy location region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private TaxonomyState() {}

    private TaxonomyState(TaxonomyState $) {
        this.activatedPolicyTypes = $.activatedPolicyTypes;
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaxonomyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaxonomyState $;

        public Builder() {
            $ = new TaxonomyState();
        }

        public Builder(TaxonomyState defaults) {
            $ = new TaxonomyState(Objects.requireNonNull(defaults));
        }

        public Builder activatedPolicyTypes(@Nullable Output<List<String>> activatedPolicyTypes) {
            $.activatedPolicyTypes = activatedPolicyTypes;
            return this;
        }

        public Builder activatedPolicyTypes(List<String> activatedPolicyTypes) {
            return activatedPolicyTypes(Output.of(activatedPolicyTypes));
        }

        public Builder activatedPolicyTypes(String... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public TaxonomyState build() {
            return $;
        }
    }

}
